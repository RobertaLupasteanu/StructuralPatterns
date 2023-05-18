package Flyweight;

import java.util.Random;

public class TestClientJoc {
    public static void main(String[] args){
        //Fara Flyweight

//        FlyweightModel3D copac1 = new FlyweightModel3D("copac.img", "Copac1");
//        FlyweightModel3D copac2 = new FlyweightModel3D("copac.img", "Copac2");
//        FlyweightModel3D copac3 = new FlyweightModel3D("copac.img", "Copac3");

        //Cu flyweight - reducem mesajele afisate
        // (Generare elemente pt copac apare o singura data)
        FlyweightModel3D copac1 = (FlyweightModel3D) FactoryFlyweight.getModel(TipModel3D.COPAC);
        FlyweightModel3D copac2 = (FlyweightModel3D) FactoryFlyweight.getModel(TipModel3D.COPAC);
        FlyweightModel3D copac3 = (FlyweightModel3D) FactoryFlyweight.getModel(TipModel3D.COPAC);

        Random random = new Random();
        String []culori = new String[]{"rosu", "albastru", "verde"};

        copac1.afisareEcran(new DetaliiAfisareEcran(
                random.nextInt(100),
                random.nextInt(100),
                culori[random.nextInt(3)]));

        copac2.afisareEcran(new DetaliiAfisareEcran(
                random.nextInt(100),
                random.nextInt(100),
                culori[random.nextInt(3)]));

        copac3.afisareEcran(new DetaliiAfisareEcran(
                random.nextInt(100),
                random.nextInt(100),
                culori[random.nextInt(3)]));


    }
}
