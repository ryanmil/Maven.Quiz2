package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> set = new TreeSet<>();
        for (Integer i : list) {
            set.add(i);
        }

        return new ArrayList<>(set);
    }

    public String join() {
        String joined = "";

        for (int i = 0; i < list.size(); i++) {
            if(i < (list.size() - 1)) {
                joined += list.get(i) + ", ";
            } else {
                joined += list.get(i);
            }

        }

        return joined;
    }

    public Integer mostCommon() {
        Integer mostCommon = 0;
        Integer mostCommonCount = 0;

        for (Integer i : list) {
            Integer currentCount = Collections.frequency(list, i);
            if(currentCount > mostCommonCount) {
                mostCommon = i;
                mostCommonCount = currentCount;
            }
        }

        return mostCommon;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
