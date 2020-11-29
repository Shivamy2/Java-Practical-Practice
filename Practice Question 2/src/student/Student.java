package student;

import java.util.Comparator;

public class Student {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        int roll = o.getRollNo();
//        if(roll > rollNo) return rollNo;
//        else return roll;
//        return this.rollNo-roll;
//    }
}
