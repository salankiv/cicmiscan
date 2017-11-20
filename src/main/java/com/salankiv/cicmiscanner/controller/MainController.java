package com.salankiv.cicmiscanner.controller;

import com.salankiv.cicmiscanner.model.SearchRequest;
import com.salankiv.cicmiscanner.model.Root;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

	@GetMapping(value = {"", "/"})
	public String loadMain(Model model) {
		model.addAttribute("amadeusRequest", new SearchRequest());
		model.addAttribute("newRoot", new Root());
		return "main";
	}

	@PostMapping(value = "/search")
	public String search(@ModelAttribute SearchRequest amadeusRequest, Model model) {

		String apikey;
		String origin;
		String destination;
		String departure_date;
		String return_date;
		int adults;
		int max_price;
		String currency;
		int number_of_results;

		String url = "http://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?";
		url += "origin=" + amadeusRequest.getOrigin();
		url += "&destination=" + amadeusRequest.getDestination();
		url += "&departure_date=" + amadeusRequest.getDeparture_date();
		url += "&return_date=" + amadeusRequest.getReturn_date();
		url += "&adults=" + amadeusRequest.getAdults();
		url += "&max_price=" + amadeusRequest.getMax_price();
		url += "&currency=" + amadeusRequest.getCurrency();
		url += "&number_of_results=" + amadeusRequest.getNumber_of_results();
		url += "&apikey=" + amadeusRequest.getApikey();
		RestTemplate request = new RestTemplate();
		String newRoot = request.getForObject(url, String.class);
		model.addAttribute("newRoot", newRoot);
		return "main";
	}
}
