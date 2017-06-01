package com.codecool.mindreader;

import java.util.Random;
import java.util.Scanner;

/**
 * This class takes the number of digits (<tt>numberOfDigits</tt>) from the user, and returns with a random number,
 * then asks the user, how many digits is in correct place. The user can only input this one parameter, and the
 * program tries to find the guessed number.
 */
public class MindReader {
    private Number guessedNumber;
    private int numberOfDigits;

    public MindReader(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
        this.setup();
    }

    /**
     * This method generates a new random number, and stores as Number type.
     */
    public void setup() {
        guessedNumber = newNumber();
    }

    /**
     * This method runs until the program finds the guessed number.
     */
    public void newTurn() {
        int correctDigits = userInput();
        while (correctDigits != numberOfDigits) {
            compareNumbers();
            correctDigits = userInput();
        }
    }

    /**
     * This method generates a new random Number, and compares with the previous number. If the number of correct digits
     * greater than previously, it sets the new number as the new guessed number.
     */
    public void compareNumbers() {
        Number newNumber = newNumber();
        if (newNumber.getNumOfCorrectDigits() > guessedNumber.getNumOfCorrectDigits()) {
            guessedNumber = newNumber;
        }
    }

    /**
     * This method generates new Number from random digits.
     * @return Returns with the generated Number.
     */
    public Number newNumber() {
        Number newNumber = new Number();
        for (int i = 0; i < numberOfDigits; i++) {
            newNumber.addDigitToList(newDigit(i));
        }
        return newNumber;
    }

    /**
     * This method generates a new int digit 0-9 or 1-9, depending from the given <tt>index</tt> parameter.
     * @param index If <tt>index</tt> is zero (first digit of the number), the new digit is 1-9, otherwise is 0-9.
     * @return Returns with the generated digit.
     */
    public int newDigit(int index) {
        return (index == 0) ? new Random().nextInt(9) : new Random().nextInt(8) + 1;
    }

    /**
     * This method takes the number of correct digits from the user.
     * @return Returns with the integer user input.
     */
    public int userInput() {
        System.out.println("Number of correct digits: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * This is the main method of the program.
     * @param args List of arguments.
     */
    public static void main(String[] args) {
        System.out.println("Digits of number: ");
        Scanner scanner = new Scanner(System.in);
        MindReader mindReader = new MindReader(scanner.nextInt());
        mindReader.newTurn();
        System.out.println("The guessed number is: " + mindReader.guessedNumber.getIntNumber());
    }
}
