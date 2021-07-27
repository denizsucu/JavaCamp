package Entities;

import Abstracts.Entity;

import java.time.LocalDate;

public class Campaign implements Entity {
    private int campaignId;
    private String campaignName;
    private int discount;
    private LocalDate startDate;
    private LocalDate endDate;

    public Campaign(){}

    public Campaign(int campaignId, String campaignName, int discount, LocalDate startDate, LocalDate endDate) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
