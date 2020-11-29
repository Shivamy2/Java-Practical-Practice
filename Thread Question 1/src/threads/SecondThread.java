package threads;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        int countOdd=0;
        for (int i=50; i>=0; --i) {
            if((i&1) == 1) {
                System.out.println(i);
                countOdd++;
            }
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Total Even numbers out of from 1 to 50 is: "+countOdd);
    }
}
