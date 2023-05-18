package Command;

public abstract class TaskAsyncAbstract {
    String denumireTask;

    public TaskAsyncAbstract(String denumireTask) {
        this.denumireTask = denumireTask;
    }

    public abstract void execurteTask(int prioritate);
}
