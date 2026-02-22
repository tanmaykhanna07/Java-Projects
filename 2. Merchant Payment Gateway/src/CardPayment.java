import java.time.*;

class CardPayment extends Payment {
    private String cardNumber;
    private String cvv;
    private LocalDate expDate;
    private String name;

    @Override
    protected boolean validatePayment() {
        if (checkCardNumber() && checkCVV() && checkExpiry()) {
            return true;
        } else {
            return false;
        }
    }

    CardPayment(double amount, int transactionID, String cardNumber, String cvv, LocalDate expDate, String name) {
        super(amount, transactionID);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCVV() {
        return cvv;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public String getName() {
        return name;
    }

    public boolean checkCardNumber() {
        return getCardNumber().length() == 16;

    }

    public boolean checkExpiry() {
        if (LocalDate.now().isBefore(getExpDate())) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkCVV() {
        if (getCVV().length() == 3 || getCVV().length() == 4) {
            return true;
        } else {
            return false;
        }
    }

}