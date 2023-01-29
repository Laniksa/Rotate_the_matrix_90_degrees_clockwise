package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int size = 8;
    int[][] myMass = new int[size][size];
    int num = 255;

        Random ran = new Random();

    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
            myMass[i][j] = ran.nextInt(num+1);
            System.out.print(myMass[i][j]+ " ");
        }
        System.out.println();

        }
    }
}
