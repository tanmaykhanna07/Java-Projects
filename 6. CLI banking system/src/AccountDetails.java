public class AccountDetails {
    private String name;
    private String accNumber;
    private int balance;
    //getters
    public int getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    } 
    public String getAccNumber(){
        return accNumber;
    }
    //setters
    public void setBalance(int balance){
        this.balance = balance;
    }
    //Constructor 
    AccountDetails(String name, final String accNumber, int initialBalance){
        if(accNumber.length() != 16){
            throw new InvalidAccountNumberException();
        }
        if(initialBalance < 0){
            throw new NegativeBalanceException();
        }
        this.name = name;
        this.accNumber = accNumber;
        this.balance= initialBalance;
    }
}
