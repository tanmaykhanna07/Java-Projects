public class AccountNotFoundException extends RuntimeException{
    AccountNotFoundException(){
        super("You cannot withdraw or deposit money in an account that doesn't exist");
    }
}
