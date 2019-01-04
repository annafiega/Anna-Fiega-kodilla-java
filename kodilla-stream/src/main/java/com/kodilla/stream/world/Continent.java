package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

   private final Set<Country> countryList = new HashSet<>();

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public Set<Country> getCountryList(){
        return new HashSet <>(countryList);
    }
}
