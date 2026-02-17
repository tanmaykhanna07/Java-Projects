class UPIPayment extends Payment{
    private String upiID;
    private String phoneNumber;
    private String bank;

    UPIPayment(double amount, int transactionID, String upiID, String phoneNumber, String bank){
        super(amount, transactionID);
        this.upiID = upiID;
        this.phoneNumber = phoneNumber;
        this.bank = bank;
    }

    @Override
    protected boolean validatePayment(){
        if(checkPhoneNumber() && checkUPI()){
            return true;
        } else{
            return false;
        }
    }

    public String getUPI(){
        return upiID;
    }
    public String getPhone(){
        return phoneNumber;
    }
    public String getBank(){
        return bank;
    }

    public boolean checkPhoneNumber(){
        if(getPhone().length() == 10){
            return getPhone().charAt(0) == '6' || getPhone().charAt(0) == '7' || getPhone().charAt(0) == '8' || getPhone().charAt(0) == '9';
        }else{
            return false;
        }
        
    }

    public boolean checkUPI(){
        if(getUPI().contains("@")){
            String[] parts = getUPI().split("@");
            if(parts.length == 2 && !parts[0].isEmpty() && !parts[1].isEmpty()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
}