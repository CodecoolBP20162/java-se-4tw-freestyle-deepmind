package com.codecool.mindreader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * This class implements the generated number. The number is stored as a list of digits. Another list contains
 * information about the digits' correctness.
 */
public class Number {
    private static final Logger logger = LoggerFactory.getLogger(Number.class);
    private List<Integer> listOfDigits;
    private List<Integer> indicesOfCorrectDigits;

    public Number() {
        this.listOfDigits = new ArrayList();
        this.indicesOfCorrectDigits = new ArrayList();
        logger.debug("Number initialized!");
    }

    /**
     * @return Returns with the list of digits.
     */
    public List<Integer> getListOfDigits() {
        return listOfDigits;
    }

    /**
     * This method adds a digit to the digit list.
     * @param digit Generated random digit.
     */
    public void addDigitToList(int digit) {
        listOfDigits.add(digit);
    }

    /**
     * This method adds the index of the correct digit to the index list.
     * @param index Index of the correct digit in the digit list.
     */
    public void addIndexToCorrectDigitsList(int index) {
        indicesOfCorrectDigits.add(index);
    }

    /**
     * This method get the list of indices.
     * @return Returns with the list of indices.
     */
    public List<Integer> getIndicesOfCorrectDigits() {
        return indicesOfCorrectDigits;
    }

    /**
     * This method get the length of the index list.
     * @return Returns with the length of the index list
     */
    public int getNumOfCorrectDigits() {
        return indicesOfCorrectDigits.size();
    }

    /**
     * This method creates an integer number from the digit list.
     * @return Returns the integer number.
     */
    public int getIntNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer digit : listOfDigits) {
            stringBuilder.append(digit);
        }
        java.lang.String stringNum = stringBuilder.toString();
        int number = Integer.parseInt(stringNum);
        logger.debug("The integer number: " + number);
        return number;
    }
}
