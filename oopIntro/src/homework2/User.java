package homework2;

public class User {
    public User(){
        System.out.println("Profil Bilgilerini Tamamlayın");
    }
    public User(int id, String name, String surname, String mail, int age, double billing, String detail){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.age = age;
        this.billing = billing;
        this.detail = detail;
    }
    int id;
    String name;
    String surname;
    String mail;
    int age;
    double billing;
    String detail;
}
