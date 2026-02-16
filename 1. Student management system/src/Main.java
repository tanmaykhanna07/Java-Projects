import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean check = true;
        Scanner inpObj = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (check) {
            System.out.print("1. Add student\n2. View students\n3. Exit\n");
            int choice = Integer.parseInt(inpObj.nextLine());
            if (choice == 1) {
                System.out.println("Enter name: ");
                String name = inpObj.nextLine();
                System.out.println("Enter age: ");
                int age = Integer.parseInt(inpObj.nextLine());
                System.out.println("Enter Roll Number: ");
                int rollNumber = Integer.parseInt(inpObj.nextLine());

                
                System.out.println("Do you want to mention the grade and the section of the student?(1.Y/2.N) ");
                int furtherDetails = Integer.parseInt(inpObj.nextLine());

                if (furtherDetails == 1) {
                    System.out.println("Enter Grade: ");
                    String grade = inpObj.nextLine();
                    System.out.println("Enter Section: ");
                    String section = inpObj.nextLine();
                    manager.addDetails1(name, age, rollNumber, grade, section);
                } else if (furtherDetails == 2) {
                    manager.addDetails2(name,age,rollNumber);
                } else {
                    System.out.println("Enter 1.Y/2.N only with the number assigned with them. Program terminated");
                    check = false;
                }

            } else if (choice == 2) {
                manager.viewDetails();
            } else if (choice == 3) {
                check = false;
                inpObj.close();
            } else {
                System.out.println("Enter choice between 1 and 3 only. Program terminated");
            }
        }

    }
}
