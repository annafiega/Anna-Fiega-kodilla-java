package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


public class World {


    private final Set<Continent> continentList = new HashSet<>();

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }
    public Set<Continent>getContinentList(){
        return new HashSet<>(continentList);
    }

    public BigDecimal getPeopleQuantity(){
        return  continentList.stream()
                .flatMap(continent->continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum, current )->sum=sum.add(current));
    }
}



