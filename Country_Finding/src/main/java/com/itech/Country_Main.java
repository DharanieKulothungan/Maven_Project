package com.itech;
import java.io.IOException;
import java.util.Scanner;

public class Country_Main {
    public static void main(String[] args) throws IOException {
        Country1 country = new Country1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CountryCode");
        String countryCode = scanner.next();
        System.out.println(country.findCountry(countryCode));

    }
}

