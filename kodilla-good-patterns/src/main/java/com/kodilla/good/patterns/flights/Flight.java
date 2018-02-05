package com.kodilla.good.patterns.flights;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDepartureAirport(), flight.getDepartureAirport()) &&
                Objects.equals(getArrivalAirport(), flight.getArrivalAirport()) &&
                Objects.equals(getStopoverAirport(), flight.getStopoverAirport());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDepartureAirport(), getArrivalAirport(), getStopoverAirport());
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
