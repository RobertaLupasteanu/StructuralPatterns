package Adapter;

public class AdaptorDisneyToACME implements IterfataCaractereACME{
    CaracterDisney caracter;

    public AdaptorDisneyToACME(CaracterDisney caracter) {
        super();
        this.caracter = caracter;
    }

    @Override
    public String getNume() {
        return caracter.getDenumire();
    }

    @Override
    public int getPuncteViata() {
        return (int) this.caracter.getNivelEnergie();
    }

    @Override
    public void getDescriere() {
        System.out.println(caracter.getDenumire() + " - "+caracter.getNivelEnergie());
    }

    @Override
    public void esteAtacat(int puncte) {
        caracter.interactioneaza(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        caracter.resetareEnergie();
    }
}
