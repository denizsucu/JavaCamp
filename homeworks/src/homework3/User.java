package homework3;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String myCourses[];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String[] myCourses) {
        this.myCourses = myCourses;
    }


}
