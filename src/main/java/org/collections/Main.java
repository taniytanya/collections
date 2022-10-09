package org.collections;

public class Main {
    public static void main(String[] args) {
        String name = "Bill";
        Members members = new Members();
        members.addMember(name);
        members.findMember(name);

        Numbers numbers = new Numbers();
        numbers.addMark("A", 5);
        numbers.addMark("B", 4);
        numbers.findMark(5);

        Countries countries = new Countries();
        countries.addCountry("Russia");
        countries.addCountry("Serbia");
        countries.addCountry("USA");
        countries.addCountry("Russia");
        countries.showAllCountries();

        Matrix matrix = new Matrix();
        matrix.addElement(5,6,7,8);
        matrix.printMatrix();

    }
}