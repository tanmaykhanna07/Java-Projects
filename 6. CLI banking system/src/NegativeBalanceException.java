public class NegativeBalanceException extends RuntimeException{

    NegativeBalanceException(){
        super("Balance cannot be negative");
    }
    
}
