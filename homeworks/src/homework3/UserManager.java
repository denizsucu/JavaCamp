package homework3;

public class UserManager {
    public void addUser(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " is added.");
    }
    public void deleteUser(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " is deleted.");
    }
}
