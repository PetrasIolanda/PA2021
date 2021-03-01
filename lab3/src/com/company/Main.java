package com.company;

public class Main {
    public static void main(String[] args) {
        Hotel v1 = new Hotel("Plaza");
        Museum v2 = new Museum("Louvre");
        Museum v3 = new Museum("Metropolitan");
        Church v4 = new Church("Westminster");
        Church v5 = new Church("Basilica");
        Restaurant v6 = new Restaurant("Vivo");
        City map = new City();
        map.addNode(v1);
        map.addNode(v2);
        map.addNode(v3);
        map.addNode(v4);
        map.addNode(v5);
        map.addNode(v6);
        map.addEdge(v2, v3, 20);
        map.addEdge(v1, v2, 10, false);
        System.out.println("The map is: \n" + map.getNodes());
    }
}
