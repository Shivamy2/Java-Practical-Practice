package main;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //printing values of primitive data types using wrapper classes
        Byte b = new Byte((byte)34);
        Short s = new Short((short)45);
        Integer i = new Integer(12);
        Float f = new Float("12.5");
        Double d = new Double(45.444);
        Long l = new Long(458237429);
        Character c = new Character('C');
        Boolean bo = new Boolean(true);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(c);
        System.out.println(bo);
    }
}
