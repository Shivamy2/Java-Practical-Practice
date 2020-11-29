package book;

public class Book {
    private String bookName;
    private String author;
    private double price;
    private long isbn;

    public Book(String bookName, String author, double price, long isbn) {
        this.bookName=bookName;
        this.author=author;
        this.price=price;
        this.isbn=isbn;
    }
    public Book() {

    }
    public void setBoolName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isbn=" + isbn +
                '}';
    }
}
