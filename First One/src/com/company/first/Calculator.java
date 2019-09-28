package com.company.first;

import java.util.Scanner;
import java.lang.Math;

class Calculator {
    private static boolean isPrime(int firstNumber) {
        if(firstNumber<=1){
            return false;
        }
        for(int i = 2; i<firstNumber; i++) {
            if(firstNumber%i==0) {
                return false;
            }
        }
        return true;
    }
    void startCalculator() {
            Scanner Input = new Scanner(System.in);
            Scanner Input2 = new Scanner(System.in);
            int choice;
            System.out.println("1 - Simple operations (/,*,+,-)");
            System.out.println("2 - More Advanced operations (sqrt, ^, prime)");
            choice = Input.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the first number: ");
                    int firstNumber = Input.nextInt();
                    System.out.println("Enter the second number: ");
                    int secondNumber = Input.nextInt();
                    System.out.println("What do you want to do with them? (/, *, +, -)");
                    String operation = Input2.nextLine();
                    if(operation.equals("/")) {
                        System.out.println("The ratio of the two numbers is: " + (firstNumber / secondNumber));
                    }
                    if(operation.equals("*")) {
                        System.out.println("The multiplication of the two numbers is: " + (firstNumber * secondNumber));
                    }
                    if(operation.equals("+")) {
                        System.out.println("The sum of the two numbers is: " + (firstNumber + secondNumber));
                    }
                    if(operation.equals("-")) {
                        System.out.println("The difference of the two numbers is: " + (firstNumber - secondNumber));
                    }
                    break;
                case 2:
                    System.out.println("1 - Square root");
                    System.out.println("2 - Power");
                    System.out.println("3 - Primeness");
                    int choice2 = Input.nextInt();
                    switch(choice2) {
                        case 1:
                            System.out.println("Enter a number: ");
                            firstNumber = Input.nextInt();
                            System.out.println("The square root of " + firstNumber + " is: " + (Math.sqrt(firstNumber)));
                            break;
                        case 2:
                            System.out.println("Enter the base: ");
                            firstNumber = Input.nextInt();
                            System.out.println("Enter the exponent: ");
                            secondNumber = Input.nextInt();
                            System.out.println(firstNumber + " raised to the power of " + secondNumber + " is: " + (Math.pow(firstNumber, secondNumber)));
                            break;
                        case 3:
                            System.out.println("Enter a number: ");
                            firstNumber = Input.nextInt();
                            if(isPrime(firstNumber)){
                                System.out.println(firstNumber + " is a prime number.");
                            }
                            else {
                                System.out.println(firstNumber + " is not a prime number.");
                            }
                            break;
                        default:
                            System.out.println("There is no such option.");
                    }
                    break;
            }
    }
}
