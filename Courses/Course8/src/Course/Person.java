package Course;

public class Person {
    String name;
    String surname;
    int age;

    Person(String name, String surname, int age){
        this.age = age;
        this.surname = surname;
        this.name = name;
    }

    void eat(){
        System.out.println("Course.Person is eating");
    }

    void sleep(){
        System.out.println("Course.Person is sleeping");
    }
}
