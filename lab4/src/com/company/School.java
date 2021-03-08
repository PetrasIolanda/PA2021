package com.company;
import java.util.*;

public class School {
    private String name;

    public Set<School> schoolList = new TreeSet<>();

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(String obj1, String obj2) {
        if (obj1 == obj2) {
            return 0;
        }
        if (obj1 == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return obj1.compareTo(obj2);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", schoolList=" + schoolList +
                '}';
    }
}


