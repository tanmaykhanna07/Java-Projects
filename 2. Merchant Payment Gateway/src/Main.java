import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        CardPayment firstPayemnt = new CardPayment(25000.0, 123456, "1234567890123456", "084", LocalDate.of(2026, 9, 28), "Someone");
        firstPayemnt.processPayment();
        System.out.println("Status: " + firstPayemnt.getStatus());
        
        UPIPayment secondPayment = new UPIPayment(90000, 02, "someone@hdfc", "9625222337", "HDFC");
        secondPayment.processPayment();
        System.out.println("Status: " + secondPayment.getStatus());
    }
}