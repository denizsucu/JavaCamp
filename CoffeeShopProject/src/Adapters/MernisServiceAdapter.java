package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.FQIKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    FQIKPSPublicSoap fqikpsPublicSoap = new FQIKPSPublicSoap();

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        return fqikpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
    }
}
