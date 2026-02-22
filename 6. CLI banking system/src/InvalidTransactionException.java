public class InvalidTransactionException extends RuntimeException {

    InvalidTransactionException(){
        super("You cannot deposit a negative amount");
    }
    
}
