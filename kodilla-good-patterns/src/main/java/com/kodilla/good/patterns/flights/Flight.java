package com.kodilla.good.patterns.flights;

public class Flight {
    String departureAirport;
    String arrivalAirport;
    String stopoverAirport;

    public Flight(String departureAirport, String arrivalAirport, String stopoverAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.stopoverAirport = stopoverAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getStopoverAirport() {
        return stopoverAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", stopoverAirport='" + stopoverAirport + '\'' +
                '}';
    }
}
