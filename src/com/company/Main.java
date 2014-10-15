package com.company;

public class Main {

    public static Matrix matrix = new Matrix();
    public static Number number = new Number();

    public static void main(String[] args) {
        matrix.printMatrix(matrix.createMatrix(matrix.readMatrixSize()));
        System.out.println(number.isArmstrong(Number.readOneNumber()));
    }
}
