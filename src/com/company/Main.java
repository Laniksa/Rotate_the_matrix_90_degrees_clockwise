package com.company;

import java.util.Random;

public class Main {
    public static int size = 8;
    public static int[][] myMass = new int[size][size];
    public static int num = 255;
    public static int [][] newMyMass = new int[size][size];

    public static void rotation270(int mas[][]){
        for(int i = size-1; i >= 0; i--){
            for(int j = 0; j < size; j++)  {
                newMyMass[i][j] = mas[j][i];
                System.out.print(newMyMass[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void rotation180(int mas[][]){
        for(int i = size-1; i >= 0; i--){
            for(int j = size-1; j >= 0; j--)  {
                newMyMass[i][j] = mas[i][j];
                System.out.print(newMyMass[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void rotation90(int mas[][]){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                newMyMass[i][j] = mas[size-j-1][i];
                System.out.print(newMyMass[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Random ran = new Random();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                myMass[i][j] = ran.nextInt(num+1);
                System.out.print(myMass[i][j]+ " ");
            }
            System.out.println();

        }
        //System.out.println("\n");

        System.out.println("\nПоворот на 90 \n");
        rotation90(myMass);
        System.out.println("\n Поворот на 180 \n");
        rotation180(myMass);
        System.out.println("\nПоворот на 270 \n");
        rotation270(myMass);

    }
}
