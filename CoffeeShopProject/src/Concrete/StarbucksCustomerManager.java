package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            save(customer);
            System.out.println("Saved to DB: " + customer.firstName);
        }
        else{
            throw new Exception("Not a valid person!");
        }

    }

}
