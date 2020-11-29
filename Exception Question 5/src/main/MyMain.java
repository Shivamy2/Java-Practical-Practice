package main;

public class MyMain {

    public static void main(String[] args) {
        Object i = String.valueOf("Shivam");
        try {
            Integer in = (Integer) i;
            System.out.println(in);
        } catch(ClassCastException e) {
            System.out.println(e.getStackTrace());
        }
    }
}