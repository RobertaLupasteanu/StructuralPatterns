package Decorator;

import Adapter.IterfataCaractereACME;
import Adapter.caracterACME;

public class DecoratorTest {
    public static void main(String [] args){
        //Decorator
        IterfataCaractereACME superman = new caracterACME("Superman", 1000);
        IterfataCaractereACME batman = new caracterACME("Batman", 1000);

        superman.getDescriere();
        superman.esteAtacat(200);
        superman.getDescriere();

        System.out.println("----------------------");

        DecoratorScut supermanCuScut = new DecoratorScut(superman, "tip 1");
        supermanCuScut.esteAtacat(200);
        supermanCuScut.getDescriere();

        System.out.println("----------------------");

        DecoratorRanitCritic batmanCuAlerta = new DecoratorRanitCritic(batman);
        batmanCuAlerta.esteAtacat(950);
        batmanCuAlerta.getDescriere();

        System.out.println("----------------------");
        DecoratorRanitCritic supermanCuScutSiAlerta = new DecoratorRanitCritic(supermanCuScut);
        supermanCuScutSiAlerta.esteAtacat(1300);
        supermanCuScutSiAlerta.getDescriere();
//        supermanCuScutSiAlerta.eliminaScut();
    }
}
