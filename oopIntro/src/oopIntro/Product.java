package oopIntro;

public class Product {

    // Constructor
    public Product(){
        System.out.println("Ben Çalıştım.");
    }
    public Product(int id, String name, double unitPrice, String detail){
        this(); // default constructor da çalışır bununla birlikte
        this.id = id; // this => bu class'taki demek
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }

    int id;
    String name;
    double unitPrice;
    String detail;
}
