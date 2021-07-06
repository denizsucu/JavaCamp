package homework2;

public class Course {
    public Course(){
        System.out.println("All Courses");
    }
    public Course(int id, String name, String instructor, int students, int completionRate, String detail){
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.students = students;
        this.completionRate = completionRate;
        this.detail = detail;
    }

    int id;
    String name;
    String instructor;
    int students;
    int completionRate;
    String detail;
}
