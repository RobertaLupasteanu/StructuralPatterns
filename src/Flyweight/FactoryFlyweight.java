package Flyweight;

import java.util.HashMap;

public class FactoryFlyweight {
    static HashMap<TipModel3D, InterfataFlyweightModel3D> modele3D = new HashMap<>();

    //versiune eager instantiation
//    static{
//        getModel(TipModel3D.COPAC);
//        getModel(TipModel3D.SOLDAT);
//        getModel(TipModel3D.STANCA);
//    }
    public static InterfataFlyweightModel3D getModel(TipModel3D tip){
        //lazy instantiation
        InterfataFlyweightModel3D model = modele3D.get(tip);

        if(model == null){
            switch (tip){
                case COPAC:
                    model = new FlyweightModel3D("copac.img", "Copac");
                    break;
                case STANCA:
                    model = new FlyweightModel3D("stanca.img", "stanca");
                    break;
                case SOLDAT:
                    model = new FlyweightModel3D("soldat.img", "Soldat");
                    break;
                default:
                    throw new UnsupportedOperationException();
            }

            modele3D.put(tip, model);
        }

        return model;
    }
}
