package com.kodilla.exception.test;


public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();


        try {
            flightFinder.findFilght(new Flight("Warszawa", "Gdansk"));
        }  catch (RouteNotFoundException e) {
            System.out.println("Airport not found.");
        }
    }

}
