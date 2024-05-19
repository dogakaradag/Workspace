public class Student {
    // Attributes
    String name;
    int age;
    double gpa;

    // Constructors
    // 1. Default Constructor
    Student(){
        this.name = "UNKNOWN!";
        this.age = 0;
        this.gpa = 0;
    }

    // 2. Parameterised Constructor
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // 3. Copy Constructor
    Student(Student obj){
        this.name = obj.name;
        this.age = obj.age;;
        this.gpa = obj.gpa;
    }

    // Methods
    void study(){
        System.out.println(this.name + " is studying!");
    }

    void printInfo(){
        System.out.println();
        System.out.println("Name ==> " + this.name);
        System.out.println("Age ==> " + this.age);
        System.out.println("GPA ==> " + this.gpa);
    }
}
