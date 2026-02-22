public class InvalidAccountNumberException extends RuntimeException{

    InvalidAccountNumberException(){
        super("Account number must be of 16 digits");
    }
    
}
