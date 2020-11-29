package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Character ch = Character.valueOf(c);
        System.out.println(ch.hashCode());
        System.out.println(ch+0);
    }
}