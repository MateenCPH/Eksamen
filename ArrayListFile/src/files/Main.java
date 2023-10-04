package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File("info.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine(file)) {
                String s = scanner.nextLine();
                String[] info = s.split(",");
                Student stud = new Student(info[0], Integer.parseInt(info[1]));
                students.add(stud);
            }
            Student s = students.get(0);
            s.setGrade(02);

            File toFile = new File("newstudent.txt");
            try {
                FileWriter writer = new FileWriter(toFile);
                for(Student sk : student) {
                    writer.write(sk.toString());
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Could not write to the file");
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
