package com.codecool.mindreader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mate on 2017.05.31..
 */
public class MindReader {
    private List<Number> numbers = new ArrayList<>();

    private void newTurn(int numOfCorrectDigits) {

    }

    public int newDigit(int index) {
        return (index == 0) ? new Random().nextInt(9) : new Random().nextInt(8) + 1;
    }

    private void newNumber() {

    }

    private void compareNumbers() {

    }

    public static void main(String[] args) {

    }
}
