package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        System.out.println("Array de numeros aleatorios: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.println(arr[i]);
        }
        System.out.println("Todo elementos que estão num índice par:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i] + " at :" + i);
            }
        }
        System.out.println("Todo elemento par:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Todos os elementos na ordem inversa.: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("Apenas o primeiro: " + arr[0] + " e último elemento: " + arr[arr.length - 1]);


        
    }
}

