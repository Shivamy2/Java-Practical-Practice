package main;

public class Main {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(5);
        Integer i2 = Integer.valueOf(19);
        Double d = Double.valueOf(56.55);
        Double d2 = Double.valueOf(45.55);
        Character c = Character.valueOf('Z');
        Character c2 = Character.valueOf('T');
        System.out.println(((i<i2) ? i: i2));
        System.out.println(((d<d2) ? d: d2));
        System.out.println(((c.hashCode()<c2.hashCode()) ? c: c2));
    }
}
