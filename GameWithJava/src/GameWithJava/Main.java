package GameWithJava;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------------------------");
        //Eklenen oyun 1
        Game game1 = new Game();
        game1.setNameOfTheGame("Valorant");
        game1.setTypeOfGame("Fps");
        game1.setGamePrice(170.0);
        System.out.println("Oyun adi:" + game1.getNameOfTheGame() + "\nTuru:" + game1.getTypeOfGame() + "\nFiyati:" + game1.getGamePrice() + " TL");
        game1.setDiscount(40.0);
        System.out.println("------------------------------------");
        //Eklenen oyun 2
        Game game2 = new Game();
        game2.setNameOfTheGame("League of Legends");
        game2.setTypeOfGame("Mmo");
        game2.setGamePrice(150.0);
        System.out.println("Oyun adi:" + game2.getNameOfTheGame() + "\nTuru:" + game2.getTypeOfGame() + "\nFiyati:" + game2.getGamePrice() + " TL");

        System.out.println("------------------------------------");

        //oyuncu tanimi ve satin alinan oyun
        User user = new User(1, "Muhammed", "Sengul", "1996", "1111111111");
        UserManagement userMethod = new UserManagement();
        //Kimlik kontrol
        userMethod.verifyingInfo(user);
        //Bilgiler guncelleme
        userMethod.updateInfo(user);
        //oyun satin alma
        userMethod.buyGame(game1);
        //oyun iade etme
        userMethod.returnGame(game1);
        adminManagement admin = new adminManagement();
        System.out.println("------------------------------------");
        //Fps oyunu icin kampanya orani
        admin.discount(game1);
        //Mmo oyunu icin kampanya orani
        admin.discount(game2);
        //Yeni kampanya ekle
        admin.addNewCampaign("Futbol");
        //Kampanya kaldir
        admin.delCampaign("Basketbol");


    }
}
