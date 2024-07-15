package Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("\033[H\033[2J");
        // File myObj = new File("test.txt");
        // if (myObj.exists()) {
        // System.out.println("File name: " + myObj.getName());
        // System.out.println("Absolute path: " + myObj.getAbsolutePath());
        // System.out.println("Writeable: " + myObj.canWrite());
        // System.out.println("Readable: " + myObj.canRead());
        // System.out.println("File size in bytes: " + myObj.length());
        // } else {
        // System.out.println("The file does not exist.");
        // }

        // // myObj.delete();
        // try {
        // myObj.createNewFile();
        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // File myObj2 = new File("/Users/zeynepdogakaradag/Desktop/");
        // String[] fileList = myObj2.list();
        // System.out.println("Files in the directory: " + Arrays.toString(fileList));

        // Create and Write to Files
        // try{
        // File myObj = new File("test.txt");

        // if (myObj.createNewFile()) {
        // System.out.println("File created: " + myObj.getName());
        // }
        // else {
        // System.out.println("File already exists.");
        // }
        // }
        // catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // try {
        // FileWriter myWriter = new FileWriter("test.txt", true);
        // myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
        // myWriter.close();
        // System.out.println("Successfully wrote to the file.");
        // } catch (Exception e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        // Read from Files
        // File myObj = new File("test.txt");
        // try {
        // Scanner myReader = new Scanner(myObj);
        // while (myReader.hasNextLine()) {
        // String data = myReader.nextLine();
        // System.out.println(data);
        // }
        // } catch (FileNotFoundException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }

        /*
         * ,.-~*´¨¯¨`*·~-.¸-(_Welcome to Java!_)-,.-~*´¨¯¨`*·~-.¸
         * 
         * String str = "amanaplanacanalpanama";
         * str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         */

        // try {
        // Scanner scanner = new Scanner(new File("students.txt"));

        // while (scanner.hasNextLine()) {
        // String line = scanner.nextLine();
        // String[] parts = line.split(" ");

        // Student student = new Student(parts[0], parts[1], parts[2]);
        // studentList.add(student);
        // }
        // } catch (FileNotFoundException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }
    }
}
