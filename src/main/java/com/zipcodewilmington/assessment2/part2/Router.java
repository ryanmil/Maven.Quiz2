package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {
    Map<String, ArrayList<String>> map = new LinkedHashMap<>();

    public void add(String path, String controller) {
        if(map.containsKey(path)) {
            map.get(path).add(controller);
        } else {
            map.put(path, new ArrayList<>());
            map.get(path).add(controller);
        }
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        if (map.containsKey(path)) {
            return map.get(path).get(0);
        } else {
            return null;
        }
    }


    public void update(String path, String studentController) {
        map.put(path, new ArrayList<>());
        map.get(path).add(studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    public String toString() {
        String result = "";

        for (Map.Entry e : map.entrySet()) {

            ArrayList list = (ArrayList)e.getValue();
                result += e.getKey() + (String)list.get(0) + "\n";
        }

        for (Map.Entry e : map.entrySet()) {
            ArrayList list = (ArrayList)e.getValue();
            if (list.size() > 1) {
                for (int i = 1; i < list.size(); i++) {
                    result += e.getKey() + (String)list.get(i) + "\n";
                }
            }
        }

        return result;
    }
}
