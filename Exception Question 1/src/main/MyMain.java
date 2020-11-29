package main;

import customException.MyFirstException;
import jdk.jshell.spi.ExecutionControlProvider;

public class MyMain {
    public static void main(String[] args) {
        int a=890,b=45;
        try {
            System.out.println(sum(a, b));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static int sum(int n1, int n2) throws MyFirstException{
        int sum = n1+n2;
        if(sum<150) throw new MyFirstException("Sum is less than 150");
        return sum;
    }
}
