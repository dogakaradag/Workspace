public class Person {
    int age;
    String name;
    String occupation;
    String gender;

    // Default constructor
    Person(){
        this.age = 0;
        this.gender = "N/A";
        this.occupation = "unknown";
        this.name = "unknown";
    }
    //parameterised constructor
    Person (String name, String gender, String occupation, int age){
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.age = age;
    }

    // copy constructor
    Person (Person obj){
        this.name = obj.name;
        this.age = obj.age;
        this.gender=obj.gender;
        this.occupation= obj.occupation;
    }

    void printInfo(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Occupation = " + occupation);
        System.out.println("Gender = " + gender);
        System.out.println();
    }
}
