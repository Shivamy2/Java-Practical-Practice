package main;

import name.Name;
import student.Student;

public class Main {
    public static void main(String[] args) {
        Student<Name> st;
        st = new Student<>();
        Student<String> st2;
        st2 = new Student<>();
        System.out.println(st.toString());
    }
}