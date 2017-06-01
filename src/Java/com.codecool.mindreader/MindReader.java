package com.codecool.mindreader;

import java.util.Random;
import java.util.Scanner;

public class MindReader {
    private Number guessedNumber;
    private int numberOfDigits;

    public MindReader(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
        this.setup();
    }

    private void setup() {
        guessedNumber = newNumber();
    }

    private void newTurn() {
        int correctDigits = userInput();
        while (correctDigits != numberOfDigits) {
            guessedNumber = newNumber();
            correctDigits = userInput();
        }
    }

    private Number newNumber() {
        Number newNumber = new Number();
        for (int i = 0; i < numberOfDigits; i++) {
            newNumber.addDigitToList(newDigit(i));
        }
        return newNumber;
    }

    private void compareNumbers(Number number) {

    }

    private void mostCorrectNumber(Number number) {
        if (number.getNumOfCorrectDigits() > guessedNumber.getNumOfCorrectDigits()) {
            guessedNumber = number;
        }
    }

    public int newDigit(int index) {
        return (index == 0) ? new Random().nextInt(9) : new Random().nextInt(8) + 1;
    }

    private int userInput() {
        System.out.println("Number of correct digits: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Digits of number: ");
        Scanner scanner = new Scanner(System.in);
        MindReader mindReader = new MindReader(scanner.nextInt());
        mindReader.newTurn();
        System.out.println("The guessed number is: " + mindReader.guessedNumber.getIntNumber());
    }
}
