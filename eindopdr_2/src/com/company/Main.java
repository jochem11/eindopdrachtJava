package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Toets toets = new Toets();
        Scanner input = new Scanner(System.in);
        System.out.println("typ hier je getal 1: ");
        int getal1 = Integer.parseInt(input.nextLine());
        System.out.println("typ hier je getal 2: ");
        int getal2 = Integer.parseInt(input.nextLine());
        System.out.println("je grootste getal = "+toets.groterdan(getal1,getal2));


        System.out.println("typ hier je naam: ");
        System.out.println(toets.garrix());


        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissors");
        System.out.println(toets.RPS());

        System.out.println("getal 1: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("getal 2: ");
        int b = Integer.parseInt(input.nextLine());
        System.out.println("uitkomst = "+toets.optel(a, b));
    }
}
