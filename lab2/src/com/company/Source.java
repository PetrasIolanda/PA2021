package com.company;

public class Source {
    private SourceType type;
    private String name;
    private int capacity;

    public Source(SourceType type, String name, int capacity) {
        this.type = type;
        this.name = name;
        this.capacity = capacity;
    }

    public Source(){

    }

    public SourceType getType() {
        return type;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Source{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
