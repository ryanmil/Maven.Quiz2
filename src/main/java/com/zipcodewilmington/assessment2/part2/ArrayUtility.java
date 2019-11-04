package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] merged = new Integer[array1.length + array2.length];

        for (int i = 0; i < merged.length; i++) {
            if(i < array1.length) {
                merged[i] = array1[i];
            } else {
                merged[i] = array2[i - array1.length];
            }
        }

        return merged;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer last = array[0];

        for (int i = 0; i < index; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                if( j == array.length - 1 ) {
                    last = array[j];
                    array[j] = array[0];
                } else {
                    Integer swap = array[j];
                    array[j] = last;
                    last = swap;
                }
            }
        }

        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(valueToEvaluate)) {
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i].equals(valueToEvaluate)) {
                count++;
            }
        }

        return count;
    }

    public Integer mostCommon(Integer[] array) {

        Integer mostCommon = array[0];
        Integer mostCommonCount = 0;

        for (int i = 0; i < array.length; i++) {
            Integer curentCount = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    curentCount++;
                }
            }

            if(curentCount > mostCommonCount) {
                mostCommonCount = curentCount;
                mostCommon = array[i];
            }
        }

        return mostCommon;
    }
}
