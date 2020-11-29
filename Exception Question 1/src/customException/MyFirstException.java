package customException;

public class MyFirstException extends Exception{
    public MyFirstException(String message) {
        System.out.println(message);
    }
}
