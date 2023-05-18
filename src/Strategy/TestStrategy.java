package Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        ModulPuncteBonus modulPuncteBonus = new ModulPuncteBonus(new StrategieFixa());

        int puncte = modulPuncteBonus.getPuncteBonusJucator("Gigel", 1000);
        System.out.println("Gigel a primit " + puncte);

        //modificare strategie
        modulPuncteBonus.setStrategieCurenta(new StrategieRandom());

        puncte = modulPuncteBonus.getPuncteBonusJucator("Gigel", 1000);
        System.out.println("Gigel a primit " + puncte);

        modulPuncteBonus.setStrategieCurenta(new InterfataCalculPuncteBonus() {
            @Override
            public int getPuncteBonus() {
                return 1000;
            }
        });

        puncte = modulPuncteBonus.getPuncteBonusJucator("Gigel", 1000);
        System.out.println("Gigel a primit " + puncte);
    }
}
