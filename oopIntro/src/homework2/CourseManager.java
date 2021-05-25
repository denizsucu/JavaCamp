package homework2;

public class CourseManager {
    public void enroll(Course course){
        System.out.println(course.name + " Kursuna Kaydınız Tamamlandı!");
    }
    public void showDetail(Course course){
        System.out.println(course.detail);
    }
}
