import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AccountManager {

    ArrayList<AccountDetails> accounts = new ArrayList<>();


    public void addAccount(String name, String cardNumber, int initialBalance){
        accounts.add(new AccountDetails(name, cardNumber, initialBalance));
    }

    public void viewBalance(String accountNumber){
        boolean checkAcount = false;
        for(int i= 0; i < accounts.size() ; i ++){
            if(accounts.get(i).getAccNumber().equals(accountNumber)){
                System.out.println("Your balance is: " + accounts.get(i).getBalance()); 
                checkAcount = true;
            }
        }if(!checkAcount){
            throw new AccountNotFoundException();
        }
    }


    public void depositMoney(int depositAmount, String accountNumber){
        boolean accountCheck = false;
        if(depositAmount <= 0){
            throw new InvalidTransactionException();
        }
        else{
            for(int i = 0; i < accounts.size() ; i++){
                if(accounts.get(i).getAccNumber().equals(accountNumber)){
                    accounts.get(i).setBalance(depositAmount + accounts.get(i).getBalance());
                    accountCheck = true;
                    break;
                }
            }
            if(!accountCheck){
                throw new AccountNotFoundException();
            }
        } 
    }

    public void withdrawMoney(int withdrawAmount, String accountNumber){
        boolean accountCheck = false;
        for(int i = 0 ;i < accounts.size() ; i++){
            if(withdrawAmount > accounts.get(i).getBalance()){
                throw new InsufficientFundsException();   
            } 
            if(accounts.get(i).getAccNumber().equals(accountNumber)){
                accounts.get(i).setBalance(accounts.get(i).getBalance() - withdrawAmount);
                accountCheck = true;
                break;
            }
        }if(!accountCheck){
            throw new AccountNotFoundException();
        }
    }

    public void toWrite() throws FileNotFoundException, IOException{
        String fileName = "6. CLI banking system/src/Data/data.dat";

        try(FileOutputStream fos = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(accounts);
        }
    }

    public void toRead() throws FileNotFoundException, ClassNotFoundException, IOException{
        String fileName = "6. CLI banking system/src/Data/data.dat";

        try(FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)){
            this.accounts = (ArrayList<AccountDetails>)ois.readObject();
            
        }
    }
}
