public class Magazine extends Items{
    private String title;
    private String coverModel;

    Magazine(String name, String title, String coverModel,String status){
        super(name, status);
        this.title = title;
        this.coverModel = coverModel;
    }

    public String getTitle(){
        return title;
    }
    public String getCoverModel(){
        return coverModel;
    }
}
