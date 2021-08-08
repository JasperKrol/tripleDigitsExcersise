package nl.novi.trippledigits;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add variables
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int maximum = 9;

        // create randomizer
        Random randomizer = new Random();

        // create three random digits
        firstDigit = randomizer.nextInt(maximum)+1;
        secondDigit = randomizer.nextInt(maximum)+1;
        thirdDigit = randomizer.nextInt(maximum)+1;

        // define sum and product of digits
        int productOfDigits = firstDigit * secondDigit * thirdDigit;
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;


        //Show sum and product
        System.out.println("Product: " + productOfDigits);
        System.out.println("Sum: " + sumOfDigits);

        // For loop for multiple rounds
        int maxTimesToPlay = 3;

        for (int i = 0; i <maxTimesToPlay; i++) {
            // Read input line
            System.out.println("Type 3 digits of your choice");
            Scanner userInput = new Scanner(System.in);

            int userChoice1 = userInput.nextInt();
            int userChoice2 = userInput.nextInt();
            int userChoice3 = userInput.nextInt();



            System.out.println("These are the digits of your choice:");
            System.out.println("Digit 1:" + userChoice1);
            System.out.println("Digit 2:" + userChoice2);
            System.out.println("Digit 3:" + userChoice3);

            // Adding win condition

            int userChoiceSum = userChoice1 + userChoice2 + userChoice3;
            int userChoiceProduct = userChoice1 * userChoice2 * userChoice3;

            boolean hasPlayerWon = userChoiceSum == sumOfDigits && userChoiceProduct == productOfDigits;

            if (hasPlayerWon) {
                System.out.println("Congratulations! You have guessed it!");
            } else {
                System.out.println("Your guesses were incorrect");
            }
            // Adding a menu if player wants to continue
            boolean continuePlaying = true;
            System.out.println("Do you want to continue guessing? Y/N");

            // Read input player
            String continuePlayingUserChoice = userInput.next();
            // Execute players choice
            switch (continuePlayingUserChoice){
                case "y": {
                    System.out.println("Great, lets continue");
                    continuePlaying = true;
                    break;
                }
                case "n": {
                    System.out.println("See you next time!");
                    continuePlaying = false;
                    break;
                }
                default:{
                    System.out.println("Incorrect input");
                    break;
                }
            }

            if (!continuePlaying){
                break;
            }
        }

        System.out.println("Thank you for playing");

    }
}
