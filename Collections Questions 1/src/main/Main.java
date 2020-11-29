package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> aL = new ArrayList<>();
        aL.add(4);
        aL.add(10);
        aL.add(9);
        aL.add(1);
        aL.add(2);
        aL.add(8);
        aL.add(7);
        aL.add(6);
        aL.add(3);
        aL.add(5);
        //this arrray will print the list in unordered way
        System.out.println(aL);
        //duplicate values are allowed in array lists
//        System.out.println(aL.add(4));
//        System.out.println(aL);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(2);
        al2.add(5);
        al2.add(6);
        al2.add(10);
        System.out.println(al2);
        System.out.println(aL.get(15));
//        aL.addAll(al2);
//        aL.addAll(2, al2);
//        System.out.println(al2);
//        System.out.println(aL);
    }
}
