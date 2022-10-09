package org.collections;

import java.util.HashSet;
import java.util.Set;

public class Countries {
    Set<String> countries = new HashSet<>();
    public void addCountry(String country){
        countries.add(country);
    }
    public void showAllCountries(){
        for(String string : countries){
            System.out.println(string);
        }
    }

}
