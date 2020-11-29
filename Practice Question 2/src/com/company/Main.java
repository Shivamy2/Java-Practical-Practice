package com.company;

import student.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student[] st = new Student[5];
        Student s = new Student();
        st[0] = new Student();
        st[0].setName("Shivam");
        st[0].setRollNo(28);
        st[1] = new Student();
        st[1].setName("Jethalal");
        st[1].setRollNo(25);
        st[2] = new Student();
        st[2].setName("ChampakLal");
        st[2].setRollNo(30);
        st[3] = new Student();
        st[3].setName("Bhide");
        st[3].setRollNo(20);
        st[4] = new Student();
        st[4].setName("PopatLal");
        st[4].setRollNo(50);
        ArrayList<Student> lst = new ArrayList<>();
        lst.add(st[0]);
        lst.add(st[1]);
        lst.add(st[2]);
        lst.add(st[3]);
        lst.add(st[4]);
        System.out.println(lst);
        deletingElements(lst);
        Collections.sort(lst, (Student o1, Student o2)-> {
                return o1.getRollNo()-o2.getRollNo();
        });
        Collections.sort(lst, (Student o1, Student o2)-> {
                return o1.getName().compareTo(o2.getName());
        });
        for (var items :
             lst) {
            System.out.println(items);
        }
//        Student[] st = new Student[5];
//        System.out.println(st[0].toString());
//        System.out.println(st[1].toString());
//        System.out.println(st[2].toString());
//        System.out.println(st[3].toString());
//        System.out.println(st[4].toString());
    }

    private static void deletingElements(ArrayList<Student> lst) {
          lst.removeIf(items-> items.getName().startsWith("S"));
    }
}
