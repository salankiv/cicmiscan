package com.salankiv.cicmiscanner.model;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {
    Result[] resultList;
    List<IataAirline> airlineList;

      public AirlineList(Result[] resultList, IataAirlineRepo iataAirlineRepo) {
        this.resultList = resultList;
        this.airlineList = new ArrayList<>();
        for (int i = 0; i < resultList.length; i++) {
            this.airlineList.add(iataAirlineRepo.findByIata(resultList[i].getAirline()));
        }
    }

    public List<IataAirline> getAirlineList() {
        return this.airlineList;
    }

}
