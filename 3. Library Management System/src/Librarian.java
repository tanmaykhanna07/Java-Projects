import java.time.*;

public class Librarian {

    public void issueItem(Items item){
        if (checkStatus(item)){
            System.out.println("Issued successfully");
            item.setStatus(Items.Status.ISSUED);
            item.setReturnDate(LocalDate.now().plusDays(14));
        } else{
            System.out.println("Either book already issued or not available");
        }
    }
    public boolean checkStatus(Items item){
        return item.getStatus() == Items.Status.AVAILABLE;
    }

    public void collectItem(Items item){
        if (item.getStatus() == Items.Status.ISSUED && LocalDate.now().isBefore(item.getReturnDate())){
            System.out.println("Book successfully returned back");
            item.setStatus(Items.Status.AVAILABLE);
        } else if (item.getStatus() == Items.Status.ISSUED && !LocalDate.now().isBefore(item.getReturnDate())){
            Period period = Period.between(item.getReturnDate(), LocalDate.now() );
            System.out.println("Book returned late, you'll have to pay a fine of " + period.getDays() * 100  + " rupees.");
            item.setStatus(Items.Status.AVAILABLE);
        } else{
            System.out.println("The book is not issued. OPEN UP FBI");
        }
    }
}
