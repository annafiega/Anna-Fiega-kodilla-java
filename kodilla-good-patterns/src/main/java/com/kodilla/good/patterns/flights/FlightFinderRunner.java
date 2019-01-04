package com.kodilla.good.patterns.flights;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFilghtFromAirport("Kraków");
        flightFinder.findFilghtToAirport("Praga");
        flightFinder.findFilghtThroughAirport("Kraków");
        flightFinder.findFilghtFromAtoBThroughC("Gdańsk","Warszawa", "Kraków");
        flightFinder.findFilghtFromAtoBThroughC("Gdańsk","Warszawa", "Katowice");
    }
}
