package Abstracts;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameSaleService {
    void sales(Customer customer, Game game, Campaign campaign);
}
