package Course;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Doga","Karadag",21, "Software Engineering");
        System.out.println("Name: " + student.name);
        System.out.println("Course.Student: " + student.surname);
        System.out.println("Age: " + student.age);
        System.out.println("Department: " + student.department);

        student.eat();
        student.sleep();
    }
}