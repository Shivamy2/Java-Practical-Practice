package com.company;

import threads.TaskFour;
import threads.TaskOne;
import threads.TaskThree;
import threads.TaskTwo;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new TaskOne();
        Thread t2 = new TaskTwo();
        Runnable r1 = new TaskThree();
        Thread t3 = new Thread(r1);
        Runnable r2 = new TaskFour();
        Thread t4 = new Thread(r2);
        t1.setPriority(9);
        t2.setPriority(8);
        t3.setPriority(7);
        t4.setPriority(6);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
