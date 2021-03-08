package com.company;

import java.util.*;
import java.util.stream.IntStream;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {

    public static <student> void main(String[] args) {

        var s = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S"+i)).toArray(Student[]::new);
        var h = IntStream.rangeClosed(0, 2).mapToObj(i -> new School("H"+i)).toArray(School[]::new);


        List<School> prefList = new ArrayList<>();
        prefList.add(h[0]);
        prefList.add(h[1]);
        prefList.add(h[2]);

        LinkedList<Student> studentList = new LinkedList<Student>();
        studentList.add(s[0]);
        studentList.add(s[1]);
        studentList.add(s[2]);
        studentList.add(s[3]);
        for (Student stud : s) {
            studentList.add(stud);
        }


        Map<Student, List<School>> studentPrefMap = new HashMap<>();
        studentPrefMap.put(s[0], prefList);
        studentPrefMap.put(s[1], prefList);
        studentPrefMap.put(s[2], Arrays.asList(h0, h1));
        studentPrefMap.put(s[3], Arrays.asList(h0, h2));

    }
}
