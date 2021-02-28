package com.company;

public class Main {

    public static void main(String[] args){
        Source s1 = new Source();
        s1.setName("S1");
        s1.setType(SourceType.FACTORY);

        Source s2 = new Source();
        s2.setName("S2");
        s2.setType(SourceType.WAREHOUSE);

        Source s3 = new Source();
        s3.setName("S3");
        s3.setType(SourceType.WAREHOUSE);

        Source[] sources = new Source[] {s1, s2, s3};

        Destination d1 = new Destination();
        d1.setName("D1");

        Destination d2 = new Destination();
        d2.setName("D2");

        Destination d3 = new Destination();
        d3.setName("D3");

        Destination[] destinations = new Destination[] {d1, d2, d3};

        int[] supply = new int[]{10,35,25};

        int[] demand = new int[]{20,25,25};

        int[][] cost = new int[][]{{2, 3, 1}, {5, 4, 8}, {5, 6, 8}};

        Problem p = new Problem(sources,destinations,supply,demand,cost);

        System.out.println(p.toString());
    }
}
