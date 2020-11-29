package com.company;

import threads.FirstThread;
import threads.SecondThread;

public class Main {

    public static void main(String[] args) {
        Runnable ft = new FirstThread();
        Thread th = new Thread(ft);
        Runnable st = new SecondThread();
        Thread th2 = new Thread(st);
        th.start();
        th2.start();
    }
}
