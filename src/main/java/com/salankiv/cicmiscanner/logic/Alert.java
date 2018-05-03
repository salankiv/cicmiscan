package com.salankiv.cicmiscanner.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.salankiv.cicmiscanner.model.Root;
import com.salankiv.cicmiscanner.service.ApiHandler;
import com.salankiv.cicmiscanner.service.EmailSender;
import com.salankiv.cicmiscanner.service.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Alert {

    @Autowired
    ApiHandler apiHandler;

    @Autowired
    EmailSender emailSender;

    public void checkLogic(String response) {
        checkLowFare(mapper(response));
    }

    public void checkLowFare(Root root) {
        for (int i = 0; i < root.getResults().length; i++) {

            if (Double.parseDouble(root.getResults()[i].getPrice()) < 100) {

                SearchRequest newSearchRequest = new SearchRequest();
                newSearchRequest.setOrigin(root.getOrigin());
                newSearchRequest.setDestination(root.getResults()[i].getDestination());
                newSearchRequest.setDeparture_date(root.getResults()[i].getDeparture_date());
                newSearchRequest.setCurrency(root.getCurrency());
                newSearchRequest.setOneway(true);

                apiHandler.sendRequest(newSearchRequest.getLowFareSearchUrl());

                String inspirationPrice = root.getResults()[i].getPrice();
                String lowFarePrice = mapper(apiHandler.getResponse()).getResults()[0].getPrice();

                if (inspirationPrice.equals(lowFarePrice)) {
                    emailSender.sendEmail(apiHandler.getResponse());
                }
            }
        }
    }

    public Root mapper(String response) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Root root = objectMapper.readValue(response, Root.class);
            return root;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Root();
    }
}
