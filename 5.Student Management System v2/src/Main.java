import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean check = true;
        Scanner inpObj = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (check) {
            System.out.print(
                    "1. Add student\n2. View students\n3. Update Student\n4. Delete Student\n5. Search Student\n6. Exit\n: ");
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
                    manager.addDetails(name, age, rollNumber, grade, section);
                    System.out.println("Successfully added student");
                } else if (furtherDetails == 2) {
                    manager.addDetails(name, age, rollNumber);
                    System.out.println("Successfully added student");
                } else {
                    System.out.println("Enter 1.Y/2.N only with the number assigned with them. Program terminated");
                    check = false;
                }

            } else if (choice == 2) {
                try {
                    manager.viewDetails();
                } catch (ArrayListEmptyException e) {
                    System.out.println(e);
                }

            } else if (choice == 3) {
                try {
                    System.out.println("Enter roll Number of student you want to update");
                    int rollNumber = Integer.parseInt(inpObj.nextLine());
                    System.out.println("Enter name: ");
                    String name = inpObj.nextLine();
                    System.out.println("Enter age: ");
                    int age = Integer.parseInt(inpObj.nextLine());
                    // System.out.println("Enter Roll Number: ");
                    // int rollNumber = Integer.parseInt(inpObj.nextLine());

                    System.out.println("Do you want to mention the grade and the section of the student?(1.Y/2.N) ");
                    int furtherDetails = Integer.parseInt(inpObj.nextLine());

                    if (furtherDetails == 1) {
                        System.out.println("Enter Grade: ");
                        String grade = inpObj.nextLine();
                        System.out.println("Enter Section: ");
                        String section = inpObj.nextLine();
                        manager.updateStudent(name, age, rollNumber, grade, section);
                        System.out.println("Successfully Updated student");
                    } else if (furtherDetails == 2) {
                        manager.updateStudent(name, age, rollNumber);
                        System.out.println("Successfully updated student");
                    }
                } catch (StudentNotFoundException e) {
                    System.out.println(e);
                } catch (RuntimeException e) {
                    System.out.println("Some error occured");
                    e.printStackTrace();
                }

            } else if (choice == 4) {
                try {
                    System.out.println("Enter Roll Number: ");
                    int rollNumber = Integer.parseInt(inpObj.nextLine());
                    manager.deleteStudent(rollNumber);
                } catch (StudentNotFoundException e) {
                    System.out.println(e);
                }

            }else if(choice == 5){
                try{
                    System.out.println("Enter Roll Number: ");
                    int rollNumber = Integer.parseInt(inpObj.nextLine());
                    manager.searchStudent(rollNumber);
                }catch(StudentNotFoundException e){
                    System.out.println(e);
                }
            }else if (choice == 6) {
                check = false;
                inpObj.close();
            } else {
                System.out.println("Enter choice between 1 and 6 only. Program terminated");
            }
        }

    }
}
