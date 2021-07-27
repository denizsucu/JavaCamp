package Concrete;

import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void save(Customer customer) throws Exception{
        System.out.println("Saved to DB of Nero: " + customer.getFirstName());
    }
}
