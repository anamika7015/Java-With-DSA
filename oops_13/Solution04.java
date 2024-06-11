package oops_13;

// Encapsulation
class Student {
    String name;
    int rollno;

    Student() {
        System.out.println("my name is anamika");
    }

    Student(String name) {
        this.name = name;

    }
}

public class Solution04 {
    public static void main(String[] args) {
        Student S1 = new Student("Radhe");
    Student S2 = new Student("anamika");

    }
}
