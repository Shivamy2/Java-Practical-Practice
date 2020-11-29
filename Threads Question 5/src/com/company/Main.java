package com.company;

public class Main implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Main();
        Thread th = new Thread(r);
        th.start();
        System.out.println(th.getState());
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("Your Task is running");
//        try {
//            Thread.sleep(2000);
//        } catch(InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
