package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Flight> board=new ArrayList<>();

    public Board() {
        board.add(new Flight("Gdańsk", "Warszawa", "Kraków"));
        board.add(new Flight("Gdańsk", "Wrocław", ""));
        board.add(new Flight("Gdańsk", "Katowice", ""));
        board.add(new Flight("Warszawa", "Rzeszów", ""));
        board.add(new Flight("Wrocław", "Warszawa", ""));
        board.add(new Flight("Wrocław", "Gdańsk", ""));
        board.add(new Flight("Warszawa", "Kraków", ""));
        board.add(new Flight("Kraków", "Warszawa", "Gdańsk"));
        board.add(new Flight("Kraków", "Poznań", ""));
    }
    public List<Flight> getBoard(){
        return new ArrayList<>(board);
    }
}
