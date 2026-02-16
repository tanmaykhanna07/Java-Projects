public abstract class Payment {
    private double amount;
    private int transactionID;
    private String status;

    public double getAmount(){
        return amount;
    }

    public int getTransactionID(){
        return transactionID;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    Payment(double amount, int transactionID) {
        this.amount = amount;
        this.transactionID = transactionID;
        
    }
    
    protected void processPayment(){
        if(validatePayment()){
            setStatus("SUCCESS");
            System.out.println("The details you entered are correct, processing payment. Payment Processed successfully");
        }
        else{
            setStatus("FAILED");
            System.out.println("Something went wrong! Enter the details again carefully");
        }
    }
    protected abstract boolean validatePayment();
    
}





