package Q2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        // Set, Map, List, Tree, Graph, Queue, Stack
        // Sorting Alogrithms
        // Searching Algorithms
        /*
            1 - 0
            2 - 1
            3 - 3
            4 - 1
            5 - 1
            6 - 0


            (0) - (0) - (2) - (0) - (1) - (3)
        */
        
        while (true) {
            menu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        studentManager.loadFromFile("file.txt");
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found");
                    }
                    break;
                case 2:
                    try {
                        studentManager.saveToFile("file.txt");
                    } catch (IOException e) {
                        System.out.println("Error writing file");
                    }
                    break;
                case 3:
                    System.out.println("Enter student ID: ");
                    String id = sc.next();

                    System.out.println("Enter student name: ");
                    String name = sc.next();
                    studentManager.addStudent(id, name);
                    break;
                case 4:
                    System.out.println("Enter student ID: ");
                    String id1 = sc.next();

                    System.out.println("Enter student name: ");
                    String name1 = sc.next();

                    studentManager.updateStudent(id1, name1);
                    break;
                case 5:
                    System.out.println("Enter student ID: ");
                    String id2 = sc.next();
                    studentManager.deleteStudent(id2);
                    break;
                case 6:
                    studentManager.printStudents();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void menu() {
        System.out.println("Menu: ");
        System.out.println("1. Read file");
        System.out.println("2. Write file");
        System.out.println("3. Add Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Print all students");
        System.out.println("7. Exit");
    }
}
