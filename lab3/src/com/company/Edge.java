package com.company;

public class Edge {
    private Node v2, v3;
    private int cost;

    Edge(Node v2, Node v3, int cost) {
        this.v2 = v2;
        this.v3 = v3;
        this.cost = cost;
    }
}
