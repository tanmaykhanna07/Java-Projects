import java.time.LocalDate;

public abstract class Items {
    private String name;
    private String status;
    private LocalDate returnDate;

    public String getName(){
        return name;
    }
    public String getStatus(){
        return status;
    }
    public LocalDate getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(LocalDate date){
        this.returnDate = date;
    }
    public void setStatus(String status){
        this.status = status;
    }

    Items(String name,String status){
        this.name = name;
        this.status = status;
    }
}