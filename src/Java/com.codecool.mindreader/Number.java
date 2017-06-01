package com.codecool.mindreader;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Number {
    private List<Integer> listOfDigits;
    private List<Integer> indicesOfCorrectDigits;

    public Number() {
        this.listOfDigits = new ArrayList();
        this.indicesOfCorrectDigits = new ArrayList<>();
    }

    public void addDigitToList(int digit) {
        listOfDigits.add(digit);
    }

    public void addIndexToCorrectDigitsList(int index) {
        indicesOfCorrectDigits.add(index);
    }

    public List<Integer> getIndicesOfCorrectDigits() {
        return indicesOfCorrectDigits;
    }

    public int getNumOfCorrectDigits() {
        return indicesOfCorrectDigits.size();
    }

    public int getIntNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer digit : listOfDigits) {
            stringBuilder.append(digit);
        }
        java.lang.String stringNum = stringBuilder.toString();
        int number = Integer.parseInt(stringNum);
        return number;
    }
}
