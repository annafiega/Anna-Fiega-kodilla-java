package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap();
        flightMap.put("Warszawa", true);
        flightMap.put("Krakow", true);
        flightMap.put("Gdansk", false);
        flightMap.put("Wroclaw", true);

        for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();

            if (key.equals(flight.getDepartureAirport()) || key.equals(flight.getArrivalAirport())){
                    if (value.equals(false))
                    {
                        throw new RouteNotFoundException();
                    }
            }
        }
         System.out.println("Flight found");

    }
}
