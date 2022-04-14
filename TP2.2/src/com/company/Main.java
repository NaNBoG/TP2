package com.company;

import java.util.Scanner;

public class Main {

    public static String MUDAR13(String x) {

        char[] y = x.toCharArray();
        for (int i = 0; i < y.length; i++) {
            char letra = y[i];

            if (letra >= 'a' && letra <= 'z') {
                // Rodar Letras minusculas

                if (letra > 'm') {
                    letra-= 13;
                } else {
                    letra += 13;
                }
            } else if (letra >= 'A' && letra <= 'Z') {
                // Rodar letras Maisculas

                if (letra > 'M') {
                    letra -= 13;
                } else {
                    letra += 13;
                }
            }
            y[i] = letra;
        }
        return new String(y);
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Digite uma string: ");
        String str= sc.nextLine();
        String MUDAR13 = MUDAR13(str);

        System.out.println(str);
        System.out.println(MUDAR13);
    }
}

