package Facade;

public class FacadeAPIJoc {

    public static void accesForum(String user, String password){
        //acces forum
        Login login = new Login();
        login.login(user, password);
        ForumJoc forum = new ForumJoc();
        Profil profil = new Profil();
        ConexiuneBazaDate conexiuneBazaDate = new ConexiuneBazaDate();
        conexiuneBazaDate.connect();
        profil.display();
        conexiuneBazaDate.disconnect();
    }

    public static void setariJoc(String user, String password){
        //modificarea setarilor jocului
        Login login2 = new Login();
        login2.login(user, password);
        ConexiuneBazaDate conexiuneBazaDate2 = new ConexiuneBazaDate();
        conexiuneBazaDate2.connect();
        CaracterJoc caracter = new CaracterJoc();
        conexiuneBazaDate2.disconnect();
    }
}
