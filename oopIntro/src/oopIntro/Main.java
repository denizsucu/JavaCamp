package oopIntro;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10); // Instance creating/ Bir class oluştururken ilk yapmamız gereken şey
//        product1.id = 1;
//        product1.name = "Lenovo V14";
//        product1.unitPrice = 15000;
//        product1.detail = "16 GB RAM";

        Product product2 = new Product(); // Instance creating/ Bir class oluştururken ilk yapmamız gereken şey
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 Gb Ram");
        product2.setUnitPrice(16000);
        product2.setDiscount(10);
        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("İçecekler");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecekler");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

    }
}
