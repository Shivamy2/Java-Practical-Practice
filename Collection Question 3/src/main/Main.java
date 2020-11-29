package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> aL = new ArrayList<>();
        aL.add(20);
        aL.add(31);
        aL.add(12);
        aL.add(10);
        aL.add(55);
        aL.add(54);
        int count=0;
        System.out.println(aL);
        for (var items :
                aL) {
            if ((items & 1) == 0) count++;
            }
        System.out.println(aL.size()-count);
    }
}
