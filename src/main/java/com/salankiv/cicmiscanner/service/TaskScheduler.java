package com.salankiv.cicmiscanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskScheduler {

    private String urlType = System.getenv("inspiration-url");
    private String apikey = System.getenv("apikey.text");
    private String origin = "BUF";
    private int max_price = 100;
    private String currency = "USD";

    @Autowired
    ApiHandler apiHandler;

    //executes search http request every minute and gives back the http response

    @Scheduled(fixedRate = 60000)
    public String automatedSearch() {
        String url = urlType;
        url += "apikey=" + this.apikey;
        url += "&origin=" + this.origin;
        url += "&currency=" + this.currency;
        url += "&max_price=" + String.valueOf(this.max_price);
        apiHandler.sendRequest(url);
        return apiHandler.getResponse();
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setMax_price(int max_price) {
        this.max_price = max_price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrigin() {
        return origin;
    }

    public int getMax_price() {
        return max_price;
    }

    public String getCurrency() {
        return currency;
    }
}
