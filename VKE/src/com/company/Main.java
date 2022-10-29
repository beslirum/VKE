package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double boy=0, kilo=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz:");
        boy=input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz:");
        kilo=input.nextDouble();

    double vke = (kilo / Math.pow(boy,2));

        System.out.println("Vucut kitle indeksiniz: " +vke);
    }
}
