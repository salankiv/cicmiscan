package com.salankiv.cicmiscanner.controller;

import com.salankiv.cicmiscanner.model.*;
import com.salankiv.cicmiscanner.repository.IataAirlineRepo;
import com.salankiv.cicmiscanner.repository.IataAirportRepo;
import com.salankiv.cicmiscanner.service.AirlineFinder;
import com.salankiv.cicmiscanner.service.AirportFinder;
import com.salankiv.cicmiscanner.service.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

	@Autowired
	IataAirportRepo iataAirportRepo;

	@Autowired
	IataAirlineRepo iataAirlineRepo;

	@Autowired
	AirportFinder airportFinder;

	@Autowired
	AirlineFinder airlineFinder;

	@GetMapping(value = {"", "/"})
	public String loadMain(Model model) {
		model.addAttribute("searchRequest", new SearchRequest());
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
		model.addAttribute("airportFinder", airportFinder);
		model.addAttribute("airlineFinder", airlineFinder);
		return "main";
	}

	@GetMapping(value = "/origin")
	public String loadOrigin(Model model) {
		model.addAttribute("searchRequest", new SearchRequest());
		model.addAttribute("newRoot", new Root());
		model.addAttribute("airports", iataAirportRepo.findAll());
		return "origin";
	}

	@PostMapping(value = "/originsearch")
	public String searchOrigin(@ModelAttribute SearchRequest searchRequest, Model model) {
		RestTemplate request = new RestTemplate();
		Root newRoot = request.getForObject(searchRequest.getInspirationSearchUrl(), Root.class);
		model.addAttribute("newRoot", newRoot);
		model.addAttribute("searchRequest", searchRequest);
		model.addAttribute("airports", iataAirportRepo.findAll());
		model.addAttribute("airportFinder", airportFinder);
		model.addAttribute("airlineFinder", airlineFinder);
		return "origin";
	}
}