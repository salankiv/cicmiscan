package com.salankiv.cicmiscanner.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.salankiv.cicmiscanner.model.Root;
import com.salankiv.cicmiscanner.service.ApiHandler;
import com.salankiv.cicmiscanner.service.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Component
public class Alert {

    @Autowired
    ApiHandler apiHandler;

    public void checkLogic(SearchRequest searchRequest) {

        ObjectMapper objectMapper = new ObjectMapper();
        apiHandler.sendRequest(searchRequest.getInspirationSearchUrl());

        try {
            Root newRoot = objectMapper.readValue(apiHandler.getResponse(), Root.class);
            checkLowFare(newRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                System.out.println(apiHandler.getResponse());
            }
        }
    }
}
