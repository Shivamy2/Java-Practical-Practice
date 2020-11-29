package student;

public class Student<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                '}';
    }
}
