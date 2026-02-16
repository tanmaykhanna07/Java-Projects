import java.time.LocalDate;

public class Customer {
    private String name;
    private String email;
    private String customerID;

    Customer(String name, String email, String customerID){
        this.name = name;
        this.email = email;
        this.customerID = customerID;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getCustomerID(){
        return customerID;
    }

    public void makePayment(Payment payment){
        payment.processPayment();
        System.out.println("Transaction Status: " + payment.getStatus());
    }
}

