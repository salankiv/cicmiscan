package com.salankiv.cicmiscanner.controller;

import com.salankiv.cicmiscanner.model.*;
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

		String url = "https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?";
		url += "origin=" + searchRequest.getOrigin();
		url += "&destination=" + searchRequest.getDestination();
		url += "&departure_date=" + searchRequest.getDeparture_date();
		if (searchRequest.isOneway() == false) {
			url += "&return_date=" + searchRequest.getReturn_date();
		}
		url += "&adults=" + searchRequest.getAdults();
		url += "&max_price=" + searchRequest.getMax_price();
		url += "&currency=" + searchRequest.getCurrency();
		url += "&number_of_results=" + searchRequest.getNumber_of_results();
		url += "&apikey=" + searchRequest.getApikey();
		RestTemplate request = new RestTemplate();
		Root newRoot = request.getForObject(url, Root.class);
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

		String url = "https://api.sandbox.amadeus.com/v1.2/flights/inspiration-search?";
		url += "apikey=" + searchRequest.getApikey();
		url += "&origin=" + searchRequest.getOrigin();
		if (!searchRequest.getDeparture_date().equals("")) {
			url += "&departure_date=" + searchRequest.getDeparture_date();
		}
		if (searchRequest.isOneway() == true) {
			url += "&one-way=true";
		}
		if (searchRequest.isDirect() == true) {
			url += "&direct=true";
		}
		if (!searchRequest.getDuration().equals("")) {
			url += "&duration=" + searchRequest.getDuration();
		}
		if (searchRequest.getMax_price() != 0) {
			url += "&max_price=" + searchRequest.getMax_price();
		}
		RestTemplate request = new RestTemplate();
		Root newRoot = request.getForObject(url, Root.class);
		List<IataAirline> airlines =  new AirlineList(newRoot.getResults(), iataAirlineRepo).getAirlineList();
		model.addAttribute("newRoot", newRoot);
		model.addAttribute("searchRequest", searchRequest);
		model.addAttribute("airports", iataAirportRepo.findAll());
		model.addAttribute("airlines", airlines);
		return "origin";
	}
}