package GameWithJava;

public class Campaign extends Game{
    private String campaignName="";
    private double campaignRate=0.0;

    public Campaign(String campaignName, double campaignRate) {
        this.campaignName = campaignName;
        this.campaignRate = campaignRate;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getCampaignRate() {
        return campaignRate;
    }

    public void setCampaignRate(double campaignRate) {
        this.campaignRate = campaignRate;
    }
}
