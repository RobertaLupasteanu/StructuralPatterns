package State;

public class TestState {
    public static void main(String[] args) {
        CaracterJoc superman = new CaracterJoc("Superman", 1000);
        superman.merge();
        superman.ataca("Joker", 100, new CaracterJoc("Joker", 1500));

        superman.esteLovit(400);
        superman.merge();
        superman.ataca("Joker", 100, new CaracterJoc("Joker", 1500));

    }
}
