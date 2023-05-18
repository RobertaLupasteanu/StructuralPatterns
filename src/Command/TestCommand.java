package Command;

public class TestCommand {
    public static void main(String[] args) {
        //Command
        TaskManager manager = new TaskManager();
        System.out.println("Jocul ruleaza fara probbleme");
        System.out.println("Lansare autosave");
        manager.adaugaTask(
                new TaskAsync("Backup", 1000, new ModulBackupDate())
        );
        System.out.println("Jocul ruleaza fara probbleme");
        System.out.println("Lansare update forum");
        manager.adaugaTask(
                new TaskAsync("Update forum", 1000, new ModulUpdateForum())
        );
        manager.executaTask();

    }
}
