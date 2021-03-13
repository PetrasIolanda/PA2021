package com.company;

import java.util.*;
import java.util.stream.IntStream;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {

    public static <student> void main(String[] args) {

        var s = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S"+i)).toArray(Student[]::new);
        var h = IntStream.rangeClosed(0, 2).mapToObj(i -> new School("H"+i)).toArray(School[]::new);

        LinkedList<Student> studentList = new LinkedList<Student>();
        Set<School> schoolTreeSet = new TreeSet<School>();

        studentList.addAll(Arrays.asList(s));
        List<Student> prefList = studentList.stream().sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        h[0].setCapacity(1);
        h[1].setCapacity(2);
        h[2].setCapacity(2);

        schoolTreeSet.addAll(Arrays.asList(h));

        System.out.println("Lista de studenti " + studentList);
        System.out.println();
        System.out.println("Lista de scoli " + schoolTreeSet);



        Map<Student, List<Student>> studentPrefMap = new HashMap<>();
        studentPrefMap.put(s[0], prefList);
        studentPrefMap.put(s[1], prefList);
        studentPrefMap.put(s[2], Arrays.asList(h0, h1));
        studentPrefMap.put(s[3], Arrays.asList(h0, h2));

    }
}
