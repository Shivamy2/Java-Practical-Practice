package threads;

public class FirstThread implements Runnable{

    @Override
    public void run() {
        int countEven=0;
        for (int i=0; i<=50; ++i) {
            if((i&1) == 0) {
                System.out.println(i);
                countEven++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Total Even numbers out of from 1 to 50 is: "+countEven);
    }
}
