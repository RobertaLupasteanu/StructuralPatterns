package Composite;

public class Test {
    public static void main(String[] args){
        //Composite
        CaracterJoc superman = new CaracterJoc("Superman");
        CaracterJoc batman = new CaracterJoc("Batman");

        Grup echipa1 = new Grup("Echipa rosie");
        echipa1.adauga(batman);
        echipa1.adauga(superman);

        Grup echipa2 = new Grup("Super echipa");
        echipa2.adauga(echipa1);
        echipa2.adauga(new CaracterJoc("Catwoman"));

        echipa2.ataca("Joker");
        echipa2.seApara();
        echipa2.get("Catwoman").seVindeca(100);
    }
}
