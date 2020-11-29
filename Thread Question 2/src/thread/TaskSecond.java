package thread;

public class TaskSecond implements Runnable{
    @Override
    public void run() {
        System.out.println("This is Task Two having Priority : "+Thread.currentThread().getPriority());
    }
}
