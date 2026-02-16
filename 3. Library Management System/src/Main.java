import java.util.Scanner;

public class Main{
    void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Librarian librarian = new Librarian();
        Items book = new Book("Hunting Adeline", "Someone", "Penguin", "Hardover", Items.Status.AVAILABLE);


        while(true){
            System.out.println(" 1. Issue Item \n 2. Return Item \n 3. Check Deadline \n 4. Exit");
            System.out.println("Enter choice: ");
            int a = scanner.nextInt();

            switch (a){
                case 1:
                    librarian.issueItem(book);
                    break;
                case 2:
                    librarian.collectItem(book);
                    break;
                case 3:
                    System.out.println(book.getReturnDate());
                    break;
                case 4:
                    System.out.println("System exiting");
                    return;
                default:
                    System.out.println("Choose a correct option");
                    break;
            }
        }
    }
}


