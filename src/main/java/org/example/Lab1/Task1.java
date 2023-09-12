package org.example.Lab1;

import java.util.*;

public class Task1 {

    public static int findSequenceOfRepetitions(int n) {

        String number = String.valueOf(n);
        String[] figures = number.split("");
        List<Integer> repetitionList = new ArrayList<>();
        int repetition = 1;

        for (int i = 0; i < figures.length - 1; i++) {
            if (figures[i].equals(figures[i + 1])) {
                repetition++;
                repetitionList.add(repetition);
            } else {
                repetition = 1;
            }
        }

        Optional<Integer> maxRepetitionSequence = repetitionList.stream().max(Integer::compareTo);

        return maxRepetitionSequence.orElse(0);
    }


}
