package Concretes;

import Abstracts.GameSaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameSaleManager implements GameSaleService {
    @Override
    public void sales(Customer customer, Game game, Campaign campaign) {
        double unitPrice = game.getUnitPrice() - (game.getUnitPrice() * campaign.getDiscount() / 100);

        System.out.println("The game, which was worth " + game.getUnitPrice() + "$ for " + customer.getFirstName() + ", was sold for " +
                unitPrice + "$ with a discount.");

        System.out.println("The campaign will start on " + campaign.getStartDate() + " and will finish on " + campaign.getEndDate()
                + ". Don't miss crazy the discounts.");
    }
}
