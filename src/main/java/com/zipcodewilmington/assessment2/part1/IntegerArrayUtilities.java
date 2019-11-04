package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2) == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer[] arr = new Integer[(stop + 1) - start];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
        }

        return arr;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length - 2];
    }
}
