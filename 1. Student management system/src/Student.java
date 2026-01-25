public class Student {

    String name;
    int age;
    final int rollNumber;
    String grade;
    String section;
    static final String schoolName = "S.S. Mota Singh Model School";

    public Student(String name, int age, int rollNumber){
        this(name, age, rollNumber,"12th","A");
    }

    public Student(String name, int age, int rollNumber, String grade, String section){
        this.name = name;
        this. age = age;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.section = section;
    }
}
