import java.time.LocalDate;

public abstract class Items {
    private String name;
    private Status status;
    public enum Status {
        AVAILABLE,
        ISSUED,
        UNAVAILABLE
    }
    private LocalDate returnDate;

    public String getName(){
        return name;
    }
    public Status getStatus(){
        return status;
    }
    public LocalDate getReturnDate(){
        return returnDate;
    }

    public void setReturnDate(LocalDate date){
        this.returnDate = date;
    }
    public void setStatus(Status status){
        this.status = status;
    }

    Items(String name,Status status){
        this.name = name;
        this.status = status;
    }
}