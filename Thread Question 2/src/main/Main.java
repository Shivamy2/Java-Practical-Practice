package main;

import thread.TaskOne;
import thread.TaskSecond;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getPriority());
        Runnable taskOne = new TaskOne();
        Thread th1 = new Thread(taskOne);
        Runnable taskSecond = new TaskSecond();
        Thread th2 = new Thread(taskSecond);
        Thread.currentThread().setPriority(10);
        th1.setPriority(8);
        th2.setPriority(7);
//        th1.start();
//        th2.start();
        th1.run();
        System.out.println("Priority of MainThread is : "+Thread.currentThread().getPriority());
        System.out.println("State of Task 1 is: "+th1.getState());
        System.out.println("State of Task 2 is: "+th2.getState());
        System.out.println("State of Main Thread is: "+Thread.currentThread().getState());
    }
}