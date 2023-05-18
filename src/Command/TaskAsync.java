package Command;

public class TaskAsync extends TaskAsyncAbstract{

    //stare specifica task-ului
    float timeout;

    //referinta catre executant
    IterfataModuleJoc modul;
    public TaskAsync(String denumireTask, float timeout, IterfataModuleJoc modulExecutant) {
        super(denumireTask);
        this.timeout = timeout;
        this.modul = modulExecutant;
    }


    @Override
    public void execurteTask(int prioritate) {
        this.modul.executaActiune();
    }
}
