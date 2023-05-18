package Proxy;

public class ProxyModulLogin implements IModulLogin{
    IModulLogin modulLogin;
    int contorIncercari = 0;

    public ProxyModulLogin(IModulLogin modulLogin) {
        this.modulLogin = modulLogin;
    }

    @Override
    public boolean login(String user, String password) {
        if(contorIncercari >= 3){
            System.out.println("Notific utilizatorul");
            return false;
        }
        boolean esteAutentificat = this.modulLogin.login(user, password);
        if(!esteAutentificat)
            contorIncercari+=1;
        else contorIncercari = 0;

        return esteAutentificat;
    }
}
