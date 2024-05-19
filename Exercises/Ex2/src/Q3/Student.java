package Q3;

public class Student {
    private int studentId;
    private String name;
    private double grade;

    public Student (int studentId, String name, double grade){
        this.grade = grade;
        this.name = name;
        this.studentId = studentId;
    }
    public double getGrade(){
        return grade;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public String toString(){
        return "ID: " + this.studentId + " name: " + this.name + " grade: " +this.grade;
    }
}
