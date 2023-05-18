package Flyweight;

import java.util.ArrayList;
import java.util.Random;

public class FlyweightModel3D implements InterfataFlyweightModel3D{
    //stare permanenta (INTRINSECA)
    String fisierModel;
    String numeModel;
    ArrayList<Integer> puncte;

    public FlyweightModel3D(String fisierModel, String numeModel) {
        this.fisierModel = fisierModel;
        this.numeModel = numeModel;
        Random random = new Random();
        this.puncte = new ArrayList<>(random.nextInt(1000));
        System.out.println("Generare model pentru "+numeModel);
    }

    //Starea temporara este data de detalii (EXTRINSECA)
    @Override
    public void afisareEcran(DetaliiAfisareEcran detalii) {
        System.out.println("Afisare model 3D pentru "+numeModel);
        System.out.println("Numar puncte: "+ this.puncte.size());
        System.out.println(String.format("Coordonate X = %d, Y = %d. Culoare = %s",
                detalii.x, detalii.y, detalii.culoare));
    }
}
