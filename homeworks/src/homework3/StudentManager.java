package homework3;

public class StudentManager extends UserManager{
    public void addUser(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " is added. And the user is a Student.");
    }
}
