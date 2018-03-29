package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// declare variables at the beginning of the program

        boolean done = false;
        Scanner scan = new Scanner(System.in);

     // first thing we need to do is think of a random number
     Random rand = new Random ();
     int secretNumber = 1 + rand.nextInt(10);
     System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");

     while (done != true) {
         //where user's data is stored - "guess"
         int guess = scan.nextInt();

      scan.nextLine();

      //print the number for a hint
         System.out.println("Hint: " + secretNumber);

      //Now give some feedback about the guess
         if (guess < secretNumber) {
             System.out.println("Your number is too low");
         } else if (guess > secretNumber) {
             System.out.println("Your number is too high");
         }else{
             //any other instance
             System.out.println("You are correct!");
         }
     }

    }
}
