package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("The campaign " + campaign.getCampaignName() + " is added the system.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("The campaign " + campaign.getCampaignName() + " is updated.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("The campaign " + campaign.getCampaignName() + " is deleted from the system.");
    }
}
