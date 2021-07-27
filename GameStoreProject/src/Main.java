import Abstracts.CustomerCheckService;
import Abstracts.GameSaleService;
import Adapters.EDevletServiceAdapter;
import Concretes.CampaignManager;
import Concretes.CustomerManager;
import Concretes.GameManager;
import Concretes.GameSaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Deniz");
        customer1.setLastName("Sucu");
        customer1.setYearOfBirth(1998);
        customer1.setNationalityId("11111111111");

        Game game1 = new Game();
        game1.setGameId(1);
        game1.setNameOfGame("Mine Craft");
        game1.setUnitPrice(100);

        Campaign campaign1 = new Campaign();
        campaign1.setCampaignId(1);
        campaign1.setCampaignName("Black Friday");
        campaign1.setDiscount(20);
        campaign1.setStartDate(LocalDate.of(2021,11,24));
        campaign1.setEndDate(LocalDate.of(2021, 11, 26));

        CustomerManager customerManager = new CustomerManager(new EDevletServiceAdapter());
        customerManager.add(customer1);

        GameManager gameManager = new GameManager();
        gameManager.add(game1);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign1);

        CustomerCheckService customerCheckService = new EDevletServiceAdapter();

        GameSaleManager gameSaleManager = new GameSaleManager();

        if (customerCheckService.CheckIfRealPerson(customer1)){
            gameSaleManager.sales(customer1, game1, campaign1);
        }
        else {
            System.out.println("The User is Not Valid. Order is cancelled!");
        }

    }
}
