package com.company.first;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Sort_An_Array {
    void startSortAnArray() {
        Scanner Input = new Scanner(System.in);
        int choice3;
        int size;
        System.out.println("How big should the array be: ");
        size = Input.nextInt();
        Integer[] array = new Integer[size];
        System.out.println("1 - Sort an array in ascending order");
        System.out.println("2 - Sort an array in descending order");
        choice3 = Input.nextInt();
        switch(choice3) {
            case 1:
                for(int i = 0; i<size; i++) {
                    System.out.println("array[" + i + "] = ");
                    array[i] = Input.nextInt();
                }
                Arrays.sort(array);
                System.out.println("Modified array: " + Arrays.toString(array));
                break;
            case 2:
                for(int i = 0; i<size; i++){
                    System.out.println("array[" + i + "] = ");
                    array[i] = Input.nextInt();
                }
                Arrays.sort(array, Collections.reverseOrder());
                System.out.println("Modified array: " + Arrays.toString(array));
                break;
            default:
                System.out.println("There is no such option.");
        }
    }
}
