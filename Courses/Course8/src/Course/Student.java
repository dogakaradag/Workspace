package Course;

public class Student extends Person{
    String department;

    Student(String name, String surname, int age, String department){
        super(name,surname,age);
        this.department = department;
    }

    @Override
    void eat() {
        System.out.println("Course.Student is eating");
    }
}
