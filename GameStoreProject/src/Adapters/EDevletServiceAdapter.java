package Adapters;

import Abstracts.CustomerCheckService;
import EDevletService.JWQKPSPublicSoap;
import Entities.Customer;

public class EDevletServiceAdapter implements CustomerCheckService {
    JWQKPSPublicSoap jwqkpsPublicSoap = new JWQKPSPublicSoap();

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        return jwqkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getYearOfBirth());
    }
}
