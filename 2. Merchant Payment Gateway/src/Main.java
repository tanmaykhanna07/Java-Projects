import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Tanmay", "tanmay@example.com", "1001");
        Payment payment = new CardPayment(25000.0, 123456, "1234567890123456", "123", LocalDate.of(2026,12,1), "Tanmay Khanna");
        customer.makePayment(payment);
    }
}