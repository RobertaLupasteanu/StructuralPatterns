package Decorator;

import Adapter.IterfataCaractereACME;

public class DecoratorRanitCritic extends DecoratorACME{
    public DecoratorRanitCritic(IterfataCaractereACME erou) {
        super(erou);
    }

    @Override
    public void esteAtacat(int puncte) {
        super.esteAtacat(puncte);
        if(this.erou.getPuncteViata() < 100)
            System.out.println("Atentie! Este ranit critic");
    }
}
