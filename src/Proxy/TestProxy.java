package Proxy;

public class TestProxy {
    public static void main (String[] args){

        //Fara proxy
        ModulLogin modulLogin = new ModulLogin("admin", "1234");
        String[] dictionarParole = new String[]{"123456", "122", "admin", "root", "1234"};
        for(String parola : dictionarParole){
            System.out.println("Incerc "+parola);
            if(modulLogin.login("admin", parola))
                System.out.println("Am gasit parola");
        }

        //Cu proxy
        ProxyModulLogin proxy = new ProxyModulLogin(modulLogin);
        for(String parola : dictionarParole){
            System.out.println("Incerc "+parola);
            if(proxy.login("admin", parola))
                System.out.println("Am gasit parola");
        }
    }
}
