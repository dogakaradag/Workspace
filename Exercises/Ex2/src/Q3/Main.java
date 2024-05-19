package Q3;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        management.addStudent(new Student(1, "Alice", 3.5));
        management.addStudent(new Student(2, "Bob", 3.8));
        management.addStudent(new Student(3, "Charlie", 3.2));

        management.updateStudent(2, "Bob Updated", 3.9);
        management.deleteStudent(1);

        management.displayStudents();
    }
}