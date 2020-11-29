package thread;

import java.util.Scanner;

public class TaskOne implements Runnable{
    @Override
    public void run() {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(input);
        System.out.println("This is Task One having Priority: "+Thread.currentThread().getPriority());
    }
}
