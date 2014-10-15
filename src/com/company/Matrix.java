package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {

    /*
    Create matrix of 0s and 1s staggered
     */
    public int[][] createMatrix(int dim) {

        int i = 0;
        int j = 0;
        int[][] matrix = new int[dim][dim];
        for(i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++){
                matrix[i][j]=((i + j + 1) % 2);
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    public int readMatrixSize() {
        int number;
        System.out.print("Input matrix size: ");
        Scanner in = new Scanner(System.in);
        try {
            number = in.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Incorrect input. Try again!");
            return readMatrixSize();
        }
        return number;
    }
}
