package State;

public interface InterfataActiuniCaracter {

    //cum obtin referinta la obiectul in sine
    //varianta 1 - interfata devine clasa abstracta
     //CaracterJoc caracter;
    public void seDeplaseaza();

    //varianta 2
    public void ataca(String inamic, int puncte,CaracterJoc caracter);


}
