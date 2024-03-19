package aulaThreads;

public class Tarefa4 extends Thread {
    public Tarefa4(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Fluxo de programa \"4\"\n");

        String name = getName();
        int priority = getPriority();

        System.out.println("Nome da Thread: " + name + "\nPrioridade da Thread: " + priority + "\n");
    }
}
