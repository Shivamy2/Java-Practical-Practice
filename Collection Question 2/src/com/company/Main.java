package com.company;

import book.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Create a List of 10 Book objects, where Book is a user defined or custom class. Book class contains
following field String bookName, String author, long isbn, & double price. Book class must be properly
encapsulated and must implement data hiding. Book class contains parameterized constructors and no-
argument constructor. Book class must override String toString() of Object class to represent Book
object as string while printing. Kindly sort the list of book by price.
public class Main {*/
class Main{
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Mahatma Gandhi", "Mohandas", 5000.50, 230023937));
        bookList.add(new Book("Java", "Mohandas", 2050.50, 235841259));
        bookList.add(new Book("Python", "Mohandas", 2500.50, 21359874));
        bookList.add(new Book("Dart", "Mohandas", 3000.50, 213654789));
        bookList.add(new Book("C++", "Mohandas", 1000.50, 231548965));
        System.out.println(bookList);
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });
        System.out.println(bookList);
    }
}
