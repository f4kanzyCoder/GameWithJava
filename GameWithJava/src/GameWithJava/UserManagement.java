package GameWithJava;

public class UserManagement extends BaseUserManagement {

    private Game game;

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
        if (user.getNationalId().length() == 10) {
            System.out.println("Bilgileriniz dogru");
            return true;
        } else {
            System.out.println("Kimlik bilgileri yanlis" + user.getNationalId());
            return false;
        }
    }

    public void buyGame(Game game) {
        System.out.println("Satin alinan oyun : " + game.getNameOfTheGame() + " Turu:" + game.getTypeOfGame() + " Fiyati:" + game.getGamePrice());
    }

    ;

    public void returnGame(Game game) {
        System.out.println("Iade edilen oyun : " + game.getNameOfTheGame());
    }

    ;


}
