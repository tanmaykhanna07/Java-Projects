import java.util.ArrayList;


public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
   

    public void addDetails1(String name, int age, int rollNumber, String grade, String section){

        students.add(new Student(name, age, rollNumber, grade, section));
    }
    public void addDetails2(String name, int age, int rollNumber){
        students.add(new Student(name, age, rollNumber));
    }

    public void viewDetails(){
        for(int i = 0; i< students.size(); i++){
            System.out.println("Name: "+students.get(i).name+ " |Age: "+students.get(i).age+ " |Roll Number: "+students.get(i).rollNumber+ " |Grade: " + students.get(i).grade + " |Section: "+ students.get(i).section);
        }
    }
}
