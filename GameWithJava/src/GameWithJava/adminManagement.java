package GameWithJava;

public class adminManagement extends BaseUserManagement implements CampaignManager {
    private Game game;
    private Campaign campaign;

    @Override
    public void register(User user) {
        System.out.println("Basariyla kayit olundu : " + user.getFirstName());
    }

    @Override
    public void deRegister(User user) {
        System.out.println("Kaydiniz  basariyla silinmistir : " + user.getFirstName());
    }

    @Override
    public void updateInfo(User user) {
        System.out.println("Bilgilerin guncellendi : " + user.getFirstName());
    }

    @Override
    public boolean verifyingInfo(User user) {
        return false;
    }


    public void addGame(Game game) {
        System.out.println("Eklenen oyun " + game.getNameOfTheGame());
    }

    public void discount(Game game) {
        if (game.getTypeOfGame().equals("Fps")) {
            System.out.println(game.getNameOfTheGame() + " Normal Fiyat:" + game.getGamePrice() + " Kampanyali Fiyat:" + game.getFpsGameCampaign());
        } else if (game.getTypeOfGame().equals("Mmo")) {
            System.out.println(game.getNameOfTheGame() + " Normal Fiyat:" + game.getGamePrice() + " Kampanyali Fiyat:" + game.getmmoGameCampaign());
        }
    }


    @Override
    public void addNewCampaign(String campaignName) {
        System.out.println("Kampanya eklendi:" + campaignName);
    }

    @Override
    public void delCampaign(String campaignName) {
        System.out.println("Kampanya silindi:" + campaignName);
    }
}
