public class Main {
    public static void main(String[] args) {
        // ClassName objName = new Constructor(params);
        Student s1 = new Student();
        Student s2 = new Student("Doga",20,3.40);
        Student s3 = new Student("Ayberk",23,3.54);
        Student s4 = new Student(s2);

        s1.study();
        s3.study();

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();
    }
}