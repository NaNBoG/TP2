package com.company;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

class Main

{
    public static void main(String[] args) throws IOException

    {

        File diskIn = new File("numeros.txt");

        Scanner input = new Scanner(diskIn);

        int[][] sqData = {{0,0,0,0},

                {0,0,0,0},

                {0,0,0,0},

                {0,0,0,0}};


        for(int y=0; y<4; y++)

            sqData[0][y] = input.nextInt();


        while(sqData[0][0] != -999)

        {


            for(int x=1; x<4; x++)

                for(int y=0; y<4; y++)

                    sqData[x][y] = input.nextInt();


            for(int x=0; x<4; x++)

            {

                for(int y=0; y<4; y++)

                    System.out.print(sqData[x][y] + " ");

                System.out.println();

            }


            int[] linhaTot = {0,0,0,0};

            for(int x=0; x<4; x++)

                for(int y=0; y<4; y++)

                    linhaTot[x] += sqData[x][y];


            int[] colTot = {0,0,0,0};

            for(int y=0; y<4; y++)

                for(int x=0; x<4; x++)

                    colTot[y] += sqData[x][y];


            int diagonal1 = 0;

            for(int x=0; x<4; x++)

                diagonal1 += sqData[x][x];

            System.out.println("Soma da Primeira Diagonal: " + diagonal1);
            int diagonal2 = 0;

            int y=3;

            for(int x=0; x<4; x++)

            {

                diagonal2 += sqData[x][y];

                y-=1;

            }
            System.out.println("Soma da Segunda Diagonal: " + diagonal2);

            if (diagonal1 == diagonal2){
                System.out.println("A soma das duas diagonais demostram o mesmo valor.");

            } else {
                System.out.println("A soma das duas diagonais demostram valores diferentes.");
            }
        }

    }

}
