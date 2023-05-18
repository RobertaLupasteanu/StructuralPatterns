package Strategy;

public class ModulPuncteBonus {
    InterfataCalculPuncteBonus strategieCurenta = null;

    public ModulPuncteBonus(InterfataCalculPuncteBonus strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public void setStrategieCurenta(InterfataCalculPuncteBonus strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public int getPuncteBonusJucator(String nume, int timpJoc){
        if(strategieCurenta != null){
            return strategieCurenta.getPuncteBonus();
        }
        else
            throw new UnsupportedOperationException();
    }

}
