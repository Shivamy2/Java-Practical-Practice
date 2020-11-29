package main;
// handling StringOutOfBoundIndex
// created a scenario where I have passed more length than the original string length.
public class MyMain {
    public static void main(String[] args) {
        String st = "Shivam";
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(st.charAt(i));
            }
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
