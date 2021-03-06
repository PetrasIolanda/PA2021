package com.company;
import java.util.ArrayList;


public class City {
    public String nameCity;
    private ArrayList<Location> nodes;

    {
        nodes = new ArrayList<>();
    }

    public City(){
        System.out.println("City Constructor");
    }
    public String getNameCity() {
        return nameCity;
    }
    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }


    public void addLocation(Location node) {
        nodes.add(node);

    }

}