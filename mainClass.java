package basics;

public class mainClass {

    public static void main(String[] args) {
        // System.out.println("Hello World");

        Person p1 = new Person();
        p1.age = 26;
        p1.name = "Ankit";

        Person p2 = new Person();
        p2.age = 16;
        p2.name = "Arpit";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
    }
}

class Person {
    String name;
    int age;
}