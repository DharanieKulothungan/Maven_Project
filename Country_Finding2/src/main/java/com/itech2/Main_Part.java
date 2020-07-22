package com.itech2;

import com.itech.Country1;
import java.io.IOException;
import java.util.Scanner;
public class Main_Part
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country1 countryFinder = new Country1();
        System.out.println("Enter Country");
        String countryCode = scanner.next();
        try {
            System.out.println(countryFinder.findCountry(countryCode));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

