public class StudentNotFoundException extends RuntimeException{

    StudentNotFoundException(){
        super("Student not found. Please check if the details entered are correct");
    }
}
