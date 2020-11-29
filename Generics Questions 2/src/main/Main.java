package main;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        double sum = Main.sumOfArray(arr);
        System.out.println("Sum of This Array is : "+sum);
    }
    private static <T extends Number> double sumOfArray(T[] arr) {
        double sum=0.0;
        for (var items :
                arr) {
            sum+=items.doubleValue();
        }
        return sum;
    }
}