package Proxy;

public class ModulLogin implements IModulLogin{
    String user;
    String pass;

    public ModulLogin(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public boolean login(String user, String password) {
        if(user.equals(this.user) && password.equals(this.pass))
            return true;
        else return false;
    }
}
