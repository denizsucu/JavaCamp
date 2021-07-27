package Concretes;

import Abstracts.CustomerCheckService;
import Abstracts.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
    private CustomerCheckService customerCheckService;

    public CustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            System.out.println("Gamer " + customer.getFirstName() + " added the system.");
        }
        else {
            System.out.println("Not a Valid Person.");
        }
    }

    @Override
    public void update(Customer customer){
        System.out.println("Gamer " + customer.getFirstName() + "'s informations updated on the system.");
    }

    @Override
    public void delete(Customer customer){
        System.out.println("Gamer " + customer.getFirstName() + " deleted from the system.");
    }
}
