package homework3;

public class Main {
    public static void main(String[] args) {

        String[] courseList = {"Java", "React"};

        Instructor user1 = new Instructor();
        user1.setId(1);
        user1.setFirstName("Engin");
        user1.setLastName("Demirog");
        user1.setMyCourses(courseList);
        user1.setAbout("Yazılım geliştirmeye lisede yazılım bölümünde okurken başladı.");

        Student user2 = new Student();
        user2.setId(2);
        user2.setFirstName("Deniz");
        user2.setLastName("Sucu");
        user2.setMyCourses(courseList);
        user2.setEmail("abc@gmail.com");
        user2.setCompletionPercentage(42);

        UserManager userManager = new UserManager();
        userManager.addUser(user1);
        userManager.addUser(user2);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addUser(user1);

        StudentManager studentManager = new StudentManager();
        studentManager.addUser(user2);

    }
}
