package oopIntro;

public class Product {

    int id;
    String name;
    double unitPrice;
    String detail;
    double discount;
//    double unitPriceAfterDiscount;

    // Constructor
    public Product(){

    }

    public Product(int id, String name, double unitPrice, String detail, double discount){
        this(); // default constructor da çalışır bununla birlikte
        this.id = id; // this => bu class'taki demek
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
//        this.unitPriceAfterDiscount = unitPriceAfterDiscount; // sadece okuduğumuz için bu alana gerek yok
    }

    // Encapsulation

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return (this.unitPrice - (this.unitPrice * this.discount / 100));
    }

}
