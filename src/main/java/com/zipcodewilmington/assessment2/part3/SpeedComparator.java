package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return -1 * Integer.compare(o1.getSpeed(), o2.getSpeed());
    }

}
