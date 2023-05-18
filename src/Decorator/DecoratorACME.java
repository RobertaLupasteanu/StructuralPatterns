package Decorator;

import Adapter.IterfataCaractereACME;

public abstract class DecoratorACME implements IterfataCaractereACME {
    IterfataCaractereACME erou;

    public DecoratorACME(IterfataCaractereACME erou) {
        super();
        this.erou = erou;
    }

    @Override
    public String getNume() {
        return erou.getNume();
    }

    @Override
    public int getPuncteViata() {
        return erou.getPuncteViata();
    }

    @Override
    public void getDescriere() {
        erou.getDescriere();
    }

    @Override
    public void esteAtacat(int puncte) {
        erou.esteAtacat(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        erou.seVindeca(puncte);
    }
}
