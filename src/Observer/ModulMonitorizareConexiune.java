package Observer;

import java.util.ArrayList;

public class ModulMonitorizareConexiune {
    ArrayList<IStareConexiuneListener> observatori = new ArrayList<>();

    //metode specifice unui observabil
    public void registerObservator(IStareConexiuneListener listener){
        this.observatori.add(listener);
    }

    public void unregisterObservator(IStareConexiuneListener listener){
        this.observatori.remove(listener);
    }

    //metoda care lanseaza evenimentul si care notifica observatorii
    public void notificareConexiunePierduta(){
        for(IStareConexiuneListener observator : observatori)
            observator.conexiunePierduta(
                    System.currentTimeMillis() + "");

    }

    public void notificareConexiuneActiva(){
        for(IStareConexiuneListener observator : observatori)
            observator.conexiuneActiva();
    }
}
