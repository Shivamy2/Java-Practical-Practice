package com.company;

import customExceptiion.NoEntryFoundException;
import employee.Employee;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        HashMap<Employee, Integer> mp = new HashMap<>();
        e1.setName("Shivam");
        e1.setSalary(20000.55);
        e1.setEmailId("sy7052789@gmail.com");
        e1.setEmpId(28);
        e2.setName("Satyam");
        e2.setSalary(20005.55);
        e2.setEmailId("sy7007723@gmail.com");
        e2.setEmpId(30);
        e3.setName("Sushma");
        e3.setSalary(20100.55);
        e3.setEmailId("shivam.yadav_cs19@gla.ac.in");
        e3.setEmpId(40);
        mp.put(e1, e1.getEmpId());
        mp.put(e2, e2.getEmpId());
        mp.put(e3, e3.getEmpId());
//        mp.entrySet().forEach(items-> {
//            System.out.println(items.getKey() + " " + items.getValue());
//        });
        try {
            System.out.println(checking(mp, e3, 45));
        } catch(NoEntryFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String checking(HashMap<Employee, Integer> mp,
                                    Employee key, int val) throws NoEntryFoundException {
        if(mp.get(key)==val) {
            return "Key: "+key+" Value: "+val;
        }
        else {
            throw new NoEntryFoundException("Entry is Not Found");
        }
    }
}