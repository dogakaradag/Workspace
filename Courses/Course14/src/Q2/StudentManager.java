package Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManager { // INSANE CLEARITY XD
    private HashMap<String, String> students; // buraya degil asagiya initialize et

    public StudentManager() {
        students = new HashMap<>();
    }

    public void addStudent(String studentID, String studentName) {
        if (students.containsKey(studentID)) {
            System.out.println("This ID already exists.");
            return;
        }
        students.put(studentID, studentName);
        System.out.println("Student added successfully.");
    }

    public String getStudent(String studentID) {
        return students.get(studentID);
    }

    public void updateStudent(String studentID, String newStudentName) {
        if (students.containsKey(studentID)) {
            students.put(studentID, newStudentName);
            System.out.println("Student name updated.");
        } else {
            System.out.println("Student ID doesn't exist.");
        }
    }

    public void deleteStudent(String studentID) {
        if (students.containsKey(studentID)) {
            students.remove(studentID);
            System.out.println("Student deleted successfully. ");
        } else {
            System.out.println("No student found with this ID");
        }
    }

    public void saveToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(new File(fileName), true);
        for (Map.Entry<String, String> entry : students.entrySet()) {
            writer.write(entry.getKey() + "," + entry.getValue() + "\n");
        }
        writer.close();
        System.out.println("Students saved to file successfully.");
    }

    public void loadFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine(); // 1234,John
            String[] parts = line.split(","); // ["1234", "John"]
            students.put(parts[0], parts[1]);
        }
        scan.close();
        System.out.println("Students loaded from file successfully.");
    }

    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("Students:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
