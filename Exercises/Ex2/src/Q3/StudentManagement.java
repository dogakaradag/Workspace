package Q3;

import Q3.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void updateStudent(int studentId, String newName, double newGrade){
        for(int i =0;i<students.size();i++) {
            if (studentId == students.get(i).getStudentId()) {
                students.get(i).setName(newName);
                students.get(i).setGrade(newGrade);
            }
        }
    }
    public void deleteStudent(int studentId){
        for(int i =0;i<students.size();i++){
            if (studentId == students.get(i).getStudentId()){
                students.remove(i);
                return;
            }
        }
        System.out.println("This student doesn't exist.");
    }
    public void displayStudents(){
        for(int i =0; i<students.size();i++){
            System.out.println(students.get(i));
        }
    }

    public void searchStudent(String name){
        for(int i=0;i<students.size();i++){
            if (name.equalsIgnoreCase(students.get(i).getName())){
                System.out.println(students.get(i));
            }
        }
    }
}
