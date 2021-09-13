import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    final static String superSecretPassword = "ihatemaking23differentrepositoriesfortheseexamples";
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("What is the password? ");
            if (scan.next().equals(superSecretPassword)) {
                System.out.println("Welcome!");
            } else {
                System.out.println("I don't know you. Get lost.");
            }
        }
    }
}
