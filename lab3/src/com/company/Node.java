package com.company;

import java.time.LocalTime;

public class Node {
    String name;
    double entryFee;
    int rank;
    LocalTime openingHour, closingHour;

    Node(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
