package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //given Given a month as an integer from 1 to 12
        System.out.println("please enter a month between 1 to 12");
        Scanner input = new Scanner(System.in);
       int month= input.nextInt();


        //when return to which quarter of the year it belongs as an integer number.

        String result = quarterOf(month);
        System.out.println(result);
    }

    private static String quarterOf(int month) {
        if (month >= 1 && month <= 3) {
            return "The month " + month + " is in the " + "first" + " quarter.";
        } else if (month >= 4 && month <= 6) {
            return "The month " + month + " is in the " + "second" + " quarter.";
        } else if (month >= 7 && month <= 9) {
            return "The month " + month + " is in the " + "third" + " quarter.";
        } else if (month >= 10 && month <= 12){
            return "The month " + month + " is in the " + "fourth" + " quarter.";
        }
        else return "Invalid month. Please enter a month between 1 and 12.";
    }
}