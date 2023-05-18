package Adapter;

import java.util.ArrayList;

public class TestClientJoc {

    public static void main(String[]args){
        ArrayList<IterfataCaractereACME> eroi = new ArrayList<>();

        eroi.add(new caracterACME("Superman", 1000));
        eroi.add(new caracterACME("Batman", 800));

        for(IterfataCaractereACME erou : eroi){
            erou.getDescriere();
            erou.esteAtacat(50);
        }

        CaracterDisney tweety =new LooneyTune("Tweety", 500);
        ArrayList<CaracterDisney> caractereDisney = new ArrayList<>();
        caractereDisney.add(tweety);

        //Adapter
//        eroi.add(tweety);
        AdaptorDisneyToACME adaptorTweety = new AdaptorDisneyToACME(tweety);

        eroi.add(adaptorTweety);

        System.out.println("----------------------");

        for(IterfataCaractereACME erou : eroi){
            erou.getDescriere();
            erou.esteAtacat(50);
        }
    }
}
