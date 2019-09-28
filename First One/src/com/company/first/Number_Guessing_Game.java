package com.company.first;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Number_Guessing_Game {
    void startNumberGuessingGame() {
        try {
            Scanner Input = new Scanner(System.in);
            Random rand = new Random();
            int secret = rand.nextInt(100) + 1;
            System.out.println("I've thought of a number from 1 to 100, and you will need to guess it or a scary fate will be reserved for you. No pressure though.");
            int guess, attempts = 0;
            do {
                guess = Input.nextInt();
                if(guess > secret) {
                    System.out.println("Lower!");
                    attempts += 1;
                }
                else {
                    System.out.println("Higher!");
                    attempts += 1;
                }
            } while(guess != secret);
            System.out.println(secret + " is the correct answer and it took you " + attempts + " attempts to guess it!");
        } catch(InputMismatchException ex1){
            System.out.println("Input is not a valid number. Try again.");
        }
    }
}
