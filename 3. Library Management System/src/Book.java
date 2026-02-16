public class Book extends Items{
    private String author;
    private String publication;
    private String type; //Hardcover or Paperback or some other

    Book(String name,String author, String publication, String type, Status status){
        super(name,status);
        this.author = author;
        this.publication = publication;
        this.type = type;
    }

    public String getAuthor(){
        return author;
    }
    public String getPublication(){
        return publication;
    }
    public String getType(){
        return type;
    }
}
