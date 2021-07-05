package inheritance;

public class Main {
    public static void main(String[] args) {

        IndividualCustomer deniz = new IndividualCustomer();
        deniz.customerNumber = "12345";

        CorporateCustomer hepsiburada = new CorporateCustomer();
        hepsiburada.customerNumber = "78965";

        UnionCustomer abc = new UnionCustomer();
        abc.customerNumber = "11111";

        CustomerManager customerManager = new CustomerManager();
//        customerManager.add(deniz); // polymorphism
//        customerManager.add(hepsiburada);
//        customerManager.add(abc);

        Customer[] customers = {deniz, hepsiburada, abc};
        customerManager.addMultiple(customers);

    }
}
