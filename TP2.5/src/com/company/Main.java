package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*Devido a erro não se conseguiu trabalhar com ficheiros*/

public class Main {
    public static void main (String [] args){
        ArrayList<Double> compras = new ArrayList<>();
        ArrayList<String> clientes = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos clientes existem? ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++){
            System.out.print("Digite nome de cliente " + (i+1) + ": \n");
            clientes.add(in.next());
            System.out.print("Digite o total de compra desse cliente " + (i+1) + ": \n");
            compras.add(in.nextDouble());
        }

        System.out.println("O Cliente com maior compra seria: " + nameOfBestCustomer(compras,clientes));

    }

    public static String nameOfBestCustomer(ArrayList<Double> compras, ArrayList<String> clientes) {
        Double max = compras.get(0);
        String max1 = clientes.get(0);

        int n = compras.size();

        int i;
        for (i = 1; i < n; i++) {
            if (compras.get(i) > max) {
                max = compras.get(i);
                max1 = clientes.get(i);
            }
        }

        return max1;
    }
}
