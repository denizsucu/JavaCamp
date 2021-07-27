import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();

        // Bu bilgiler yanlış
        Customer deniz = new Customer();
        deniz.setId(1);
        deniz.setFirstName("Deniz");
        deniz.setLastName("Sucu");
        deniz.setDateOfBirth(LocalDate.of(1998, 6,25));
        deniz.setNationalityId("11111111112");

        Customer engin = new Customer(2, "Engin", "Demirog", LocalDate.of(1985, 2, 17), "11111111111");

        neroCustomerManager.save(engin);
        starbucksCustomerManager.save(deniz);


    }

}