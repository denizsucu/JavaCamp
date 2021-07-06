package homework2;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Deniz", "Sucu", "denizsucumzfl@gmail.com", 23, 100, "");
        User user2 = new User(2, "Ayse", "Ayse", "ayseayse@gmail.com", 25, 500, "");
        User user3 = new User(3, "Ali", "Ali", "aliali@gmail.com", 20, 200, "");
        User user4 = new User(4, "Fatma", "Fatma", "fatmafatma@gmail.com", 22, 120.5, "");
        User user5 = new User();

        User[] users = {user1, user2, user3, user4, user5};

        System.out.println(users.length);

        for (User user: users){
            System.out.println(user.name + " " + user.surname);
        }

        System.out.println("***********************************************************************************************************");

        Course course1 = new Course(1, "Java Kursu", "Engin Demiroğ", 5000, 17, "Sıfırdan İleri Seviye!!");
        Course course2 = new Course(2, "C# Kursu", "Engin Demiroğ", 2000, 57, "İleri Seviye!!");
        Course course3 = new Course(3, "Python Kursu", "Engin Demiroğ", 10000, 44, "Başlangıç Seviye!!");

        Course[] courses = {course1, course2, course3};

        CourseManager courseManager = new CourseManager();

        for (Course course: courses){
            System.out.println(course.name);
            courseManager.enroll(course);
            courseManager.showDetail(course);
        }
    }
}
