package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Shivam");
        mp.put(2, "Satyam");
        mp.put(3, "Sushma");
        mp.put(4, "Prabhavati Devi");
        //printing using entry interface in Map collection
        mp.entrySet().forEach(item-> {
            System.out.println("Order : "+item.getKey()+ " " +"Name : "+item.getValue());
        });
        //printing using singleton method in collections framework
        System.out.println(Collections.singletonList(mp));
        //using array as list
        System.out.println(Arrays.asList(mp));
        //printing using set
        for (var items :
                mp.keySet()) {
            System.out.println(items*2 + mp.get(items));
        }
    }
}