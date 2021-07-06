package homework3;

public class InstructorManager extends UserManager{
    public void addUser(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " is added. And the user is an Instructor.");
    }
}
