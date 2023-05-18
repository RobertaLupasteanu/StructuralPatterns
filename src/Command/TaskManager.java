package Command;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<TaskAsyncAbstract> taskuri = new ArrayList<>();

    public void adaugaTask(TaskAsyncAbstract task){
        taskuri.add(task);
    }

    public void executaTask(){
        if(this.taskuri.size() > 0){
            TaskAsyncAbstract task = taskuri.get(0);
            taskuri.remove(0);
            task.execurteTask(1000);
        }
    }
}
