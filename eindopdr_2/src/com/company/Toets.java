package com.company;

import java.util.Random;
import java.util.Scanner;

public class Toets {

    public int groterdan(int a, int b) {
        if(a > b) {
            return a;
        } else{
            return b;
        }

    }
    public String garrix () {
        Scanner input = new Scanner(System.in);
        String naam = input.nextLine();
        if (naam.length() < 4) {
            return (naam + "X");
        } else {
            return (naam.substring(0,3) + "X");
        }
    }
    public String RPS () {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int RPS = Integer.parseInt(input.nextLine());
        int RPSR = random.nextInt(3) + 1;
        if (RPS == RPSR) {
            return "gelijkspel";
        } if (RPS == 1 && RPSR == 2) {
            return "verloren";
        } if (RPS == 1 && RPSR == 3) {
            return "gewonnen";
        } if (RPS == 2 && RPSR == 1) {
            return "gewonnen";
        } if (RPS == 2 && RPSR == 3) {
            return "verloren";
        } if (RPS == 3 && RPSR == 1) {
            return "verloren";
        } if (RPS == 3 && RPSR == 2){
            return "gewonnen";
        } if (RPS > 3){
            return "je kan echt weinig";
        }
        return null;
    }
    public int optel (int a, int b) {
        return a + b;
    }
}
