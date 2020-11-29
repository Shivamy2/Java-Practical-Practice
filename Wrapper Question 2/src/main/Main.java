package main;
// representing boxing and unboxing in Wrapper Classes
public class Main {
    public static void main(String[] args) {
        Boolean b = Boolean.valueOf(true); // boxing
        Boolean b2 = true; //auto-boxing
        boolean b3 = b2.booleanValue(); //unboxing
        boolean b4 = b; //auto-unboxing;
        System.out.println("Boxing Value: "+b);
        System.out.println("Auto-Boxing Value: "+b2);
        System.out.println("UnBoxing Value: "+b3);
        System.out.println("Auto-UnBoxing Value: "+b4);
    }
}
