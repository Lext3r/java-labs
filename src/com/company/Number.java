package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {

    public static String isArmstrong(int num) {
        int pow = digitalNumber(num);
        int sum = 0;
        int n = num;
        while (n != 0){
            sum += Math.pow((n % 10), pow);
            n /= 10;
        }
        if(sum == num) {
            return ("Your number is Armstrong number");
        }
            else {
                return ("Number isn't an Armstrong number");
            }
    }

    public static int digitalNumber(int num) {
        String digitalNumber = Integer.toString(num);
        return(digitalNumber.length());
    }

    public static int readOneNumber() {
        int number;
        System.out.print("Input number: ");
        Scanner in = new Scanner(System.in);
        try {
            number = in.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("incorrect input. Try again!");
            return readOneNumber();
        }
        return number;
    }

}
