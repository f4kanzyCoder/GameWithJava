package GameWithJava;

public class Game extends User {
    private String nameOfTheGame;
    private String typeOfGame;
    private double gamePrice = 0.0;
    private String campaignName = "";
    private double campaignRate = 0.0;
    private double fpsGameCampaign = 10.0;
    private double mmoGameCampaign = 15.0;
    private double discount = 0.0;

    public String getNameOfTheGame() {
        return nameOfTheGame;
    }

    public void setNameOfTheGame(String nameOfTheGame) {
        this.nameOfTheGame = nameOfTheGame;
    }

    public String getTypeOfGame() {
        return typeOfGame;
    }

    public void setTypeOfGame(String typeOfGame) {
        this.typeOfGame = typeOfGame;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double getFpsGameCampaign() {
        return this.gamePrice - (this.gamePrice * this.fpsGameCampaign / 100);
    }


    public double getmmoGameCampaign() {
        return this.gamePrice - (this.gamePrice * this.mmoGameCampaign / 100);
    }


}
