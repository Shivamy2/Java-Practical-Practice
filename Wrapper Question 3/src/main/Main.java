package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.asList(arr));
        Integer summ = sum(arr);
        Double av = average(summ, arr.length);
        System.out.println("Sum of Array is: "+summ.intValue()+"\nAverage is : "+av.doubleValue());
    }
    public static Integer sum(Integer[] arr) {
        Integer sum = 0;
        for (var items :
                arr) {
            sum+=items;
        }
        return sum;
    }
    public static Double average(Integer sum, Integer noOfElements) {
        return (double)sum/noOfElements;
    }
}
