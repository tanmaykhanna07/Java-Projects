import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    // add details overloaded functions
    public void addDetails(String name, int age, int rollNumber, String grade, String section) {

        students.add(new Student(name, age, rollNumber, grade, section));
    }

    public void addDetails(String name, int age, int rollNumber) {
        students.add(new Student(name, age, rollNumber));
    }

    // View Details
    public void viewDetails() {
        if (students.isEmpty()) {
            throw new ArrayListEmptyException();
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Name: " + students.get(i).getName() + " |Age: " + students.get(i).getAge()
                        + " |Roll Number: " + students.get(i).getRollNumber() + " |Grade: " + students.get(i).getGrade()
                        + " |Section: " + students.get(i).getSection());
            }
        }
    }

    // Search for student
    public void searchStudent(int rollNumber) {
        boolean isFound = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                System.out.println("Student found, details below");
                System.out.println("Name: " + students.get(i).getName() + " |Age: " + students.get(i).getAge()
                        + " |Roll Number: " + students.get(i).getRollNumber() + " |Grade: "
                        + students.get(i).getGrade() + " |Section: " + students.get(i).getSection());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new StudentNotFoundException();
        }
    }

    

    // Delete student
    public void deleteStudent(int rollNumber) {

        boolean isFound = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                System.out.println("Student found, deleting now");
                students.remove(i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new StudentNotFoundException();
        }

    }

    // Update Student
    public void updateStudent(String name, int age, int rollNumber, String grade, String section) {
        boolean isFound = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                Student updatedStudent = new Student(name, age, rollNumber, grade, section);
                students.set(i, updatedStudent);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new StudentNotFoundException();
        }

    }

    public void updateStudent(String name, int age, int rollNumber) {
        boolean isFound = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                Student updatedStudent = new Student(name, age, rollNumber);
                students.set(i, updatedStudent);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new StudentNotFoundException();
        }
    }
    //Serialization
    public void toWrite() throws Exception{
        String filename = "/home/tanmay-khanna/Desktop/Java Projects/5.Student Management System v2/src/Data/data.dat";

        try(FileOutputStream fos = new FileOutputStream(filename); ObjectOutputStream oos = new ObjectOutputStream(fos)){
            for(int i = 0; i < students.size(); i++){
                
            }
        }
    }
}