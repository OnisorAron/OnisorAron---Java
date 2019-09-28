package com.company.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String n = "1";
        while(!n.equals("0")) {
            System.out.println("0 - Exit");
            System.out.println("1 - Calculator");
            System.out.println("2 - Number Guessing Game");
            System.out.println("3 - Sort An Array");
            Scanner originalInput = new Scanner(System.in);
            n = originalInput.next();
            switch(n) {
                case "0":
                    System.out.println("Exiting...");
                    break;
                case "1":
                    (new Calculator()).startCalculator();
                    break;
                case "2":
                    (new Number_Guessing_Game()).startNumberGuessingGame();
                    break;
                case "3":
                    (new Sort_An_Array()).startSortAnArray();
                    break;
                case "4":

                    break;
                case "5":

                    break;
                default:
                    System.out.println("There is no such option.");
            }
        }
    }
}
