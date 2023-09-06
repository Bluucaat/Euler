package com.bluu.cat;

import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("triangle.txt"));
            Scanner sc = new Scanner(br);
            int n = 0;

            while (sc.hasNextLine()) {
                n++;
                sc.nextLine();
            }

            br.close();
            sc.close();

            br = new BufferedReader(new FileReader("triangle.txt"));
            sc = new Scanner(br);


            int[][] numArray = new int[n][n];


            for (int i = 0; i < n; i++) {
                String[] line = sc.nextLine().split(" ");
                for (int j = 0; j <= i; j++) {
                    numArray[i][j] = Integer.parseInt(line[j]);
                }
            }
            int bignum = 0;
            for (int i = n-1; i > 0; i--) {
                for (int j = 0; j <= i-1; j++) {
                    int numberAbove = numArray[i-1][j];
                    int numberSum = numArray[i][j] + numArray[i-1][j];
                    int numberSumNextTo = numArray[i][j+1] + numArray[i-1][j];
                    numArray[i-1][j] = Math.max(numberSum, numberSumNextTo);
                    bignum = numArray[i-1][j];
                }
            }

            System.out.println(bignum);

            //int[][] triangleArr = new int[][];

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
