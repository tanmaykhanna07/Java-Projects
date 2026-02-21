import java.util.ArrayList;


public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();


    public void addDetails1(String name, int age, int rollNumber, String grade, String section) {

        students.add(new Student(name, age, rollNumber, grade, section));
    }

    public void addDetails2(String name, int age, int rollNumber) {
        students.add(new Student(name, age, rollNumber));
    }

    public void viewDetails() {
        if (students.isEmpty()) {
            throw new StudentNotFoundException();
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Name: " + students.get(i).getName() + " |Age: " + students.get(i).getAge() + " |Roll Number: " + students.get(i).getRollNumber() + " |Grade: " + students.get(i).getGrade() + " |Section: " + students.get(i).getSection());
            }
        }
    }

    public void searchStudent(){

    }
}