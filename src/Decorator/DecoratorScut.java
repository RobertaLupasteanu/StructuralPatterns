package Decorator;

import Adapter.IterfataCaractereACME;

public class DecoratorScut extends DecoratorACME{

    String scut;
    public DecoratorScut(IterfataCaractereACME erou, String scut) {
        super(erou);
        this.scut = scut;
    }

    @Override
    public void esteAtacat(int puncte) {
        System.out.println("Se apara cu un scut "+scut);
        super.esteAtacat(puncte/2);
    }

    public IterfataCaractereACME eliminaScut(){
        return this.erou;
    }
}
