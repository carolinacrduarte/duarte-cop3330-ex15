/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = input.nextLine(); //String scanner to read password.

        if(password.equals("abc$123")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }

    }
}


