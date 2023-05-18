package Facade;

public class TestClientJoc {
    public static void main(String [] args){
        //acces forum
        Login login = new Login();
        login.login("test", "1234");
        ForumJoc forum = new ForumJoc();
        Profil profil = new Profil();
        ConexiuneBazaDate conexiuneBazaDate = new ConexiuneBazaDate();
        conexiuneBazaDate.connect();
        profil.display();
        conexiuneBazaDate.disconnect();

        //modificarea setarilor jocului
        Login login2 = new Login();
        login2.login("test", "1234");
        ConexiuneBazaDate conexiuneBazaDate2 = new ConexiuneBazaDate();
        conexiuneBazaDate2.connect();
        CaracterJoc caracter = new CaracterJoc();
        conexiuneBazaDate2.disconnect();

        //prin Facade
        FacadeAPIJoc.accesForum("test", "1234");
        FacadeAPIJoc.setariJoc("test", "1234");
    }
}
