package com.salankiv.cicmiscanner.controller;

import com.salankiv.cicmiscanner.model.*;
import com.salankiv.cicmiscanner.service.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MainController {

	@Autowired
	IataAirportRepo iataAirportRepo;

	@Autowired
	IataAirlineRepo iataAirlineRepo;

	@Bean
	public SearchRequest getSearchRequest() {
		return new SearchRequest();
	}

	@GetMapping(value = {"", "/"})
	public String loadMain(Model model) {
		model.addAttribute("searchRequest", getSearchRequest());
		model.addAttribute("airports", iataAirportRepo.findAll());
		return "main";
	}

	@PostMapping(value = "/search")
	public String search(@ModelAttribute SearchRequest searchRequest, Model model) {
		RestTemplate request = new RestTemplate();
		Root newRoot = request.getForObject(searchRequest.getLowFareSearchUrl(), Root.class);
		model.addAttribute("results", newRoot.getResults());
		model.addAttribute("searchRequest", searchRequest);
		model.addAttribute("airports", iataAirportRepo.findAll());
		return "main";
	}

	@GetMapping(value = "/origin")
	public String loadOrigin(Model model) {
		model.addAttribute("searchRequest", getSearchRequest());
		model.addAttribute("newRoot", new Root());
		model.addAttribute("airports", iataAirportRepo.findAll());
		return "origin";
	}

	@PostMapping(value = "/originsearch")
	public String searchOrigin(@ModelAttribute SearchRequest searchRequest, Model model) {
		RestTemplate request = new RestTemplate();
		Root newRoot = request.getForObject(searchRequest.getInspirationSearchUrl(), Root.class);
		List<IataAirline> airlines =  new AirlineList(newRoot.getResults(), iataAirlineRepo).getAirlineList();
		model.addAttribute("newRoot", newRoot);
		model.addAttribute("searchRequest", searchRequest);
		model.addAttribute("airports", iataAirportRepo.findAll());
		model.addAttribute("airlines", airlines);
		return "origin";
	}
}