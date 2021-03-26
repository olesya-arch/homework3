package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int month = 5;
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        }
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }

        int[] array = {2, 3, 8, 7, 9, 4, 6, 1, 6, 33};

        for (int a = array.length - 1; a >= 0; a--) {
            System.out.println(array[a] + " ");
        }

        int squareArray[][] = new int[2][3];
        squareArray [0][0] = 5;
        squareArray [0][1] = 9;
        squareArray [0][2] = 7;
        squareArray [1][0] = 4;
        squareArray [1][1] = 2;
        squareArray [1][2] = 8;


        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(" " + squareArray[i][j] + " [" + i +"][" + j + "] " + " ");
            }
            System.out.println(" ");
        }

        


    }


}
