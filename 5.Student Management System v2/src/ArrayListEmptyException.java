public class ArrayListEmptyException extends RuntimeException {
    ArrayListEmptyException(){
        super("No students in the database");
    }
}
