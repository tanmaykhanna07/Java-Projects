public class InsufficientFundsException extends RuntimeException{
    InsufficientFundsException(){
        super("You cannot withdraw more money than you have in your account");
    }
}
