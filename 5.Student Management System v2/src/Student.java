public class Student {

    private String name;
    private int age;
    private final int rollNumber;
    private String grade;
    private String section;
    static final String schoolName = "S.S. Mota Singh Model School";

    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public String getGrade(){
        return grade;
    }
    public String getSection(){
        return section;
    }
    public static String getSchoolName(){
        return schoolName;
    }

    public Student(String name, int age, int rollNumber, String grade, String section) {
        if(age < 0 || age > 120){
            throw new InvalidAgeException();
        }
        if(rollNumber < 0){
            throw new InvalidRollNumberException();
        }
        this.name = name;
        this. age = age;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.section = section;
    }
    public Student(String name, int age, int rollNumber){
        this(name, age, rollNumber,"12th","A");
    }
}
