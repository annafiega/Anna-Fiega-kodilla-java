package com.kodilla.good.patterns.flights;


import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFilghtFromAirport(String airport ) {
        System.out.println("Flights from: "+airport);
        Board board=new Board();

        List <Flight>boardResult=board.getBoard().stream()
                .filter(s -> s.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
        if (boardResult.size()==0) {
            System.out.println("Flight not found ");
        }
        boardResult.stream()
                .forEach(System.out::println);
    }

    public void findFilghtToAirport(String airport ) {
        System.out.println("Flights to: "+airport);
        Board board=new Board();

        List <Flight>boardResult=board.getBoard().stream()
                .filter(s -> s.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
        if (boardResult.size()==0) {
            System.out.println("Flight not found ");
        }

        boardResult.stream()
                .forEach(System.out::println);
    }

    public void findFilghtThroughAirport(String airport ) {
        System.out.println("Flights through: "+airport);
        Board board=new Board();

        List <Flight>boardResult=board.getBoard().stream()
                .filter(s -> s.getStopoverAirport().equals(airport))
                .collect(Collectors.toList());
        if (boardResult.size()==0) {
            System.out.println("Flight not found ");
        }

        boardResult.stream()
                .forEach(System.out::println);
    }
    public void findFilghtFromAtoBThroughC(String A,String B, String C ) {
        System.out.println("Flight from "+A+ " to "+B+ " through  "+C);
        Board board=new Board();

        List <Flight>boardResult=board.getBoard().stream()
                .filter(s -> s.getDepartureAirport().equals(A)&& s.getArrivalAirport().equals(B)&&s.getStopoverAirport().equals(C))
                .collect(Collectors.toList());
        if (boardResult.size()==0) {
            System.out.println("Flight not found ");
        }

        boardResult.stream()
                .forEach(System.out::println);
    }
}
