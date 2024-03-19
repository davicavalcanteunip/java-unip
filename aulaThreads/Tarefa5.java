package aulaThreads;

public class Tarefa5 extends Thread {
    public Tarefa5(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Fluxo de programa \"5\"\n");

        String name = getName();
        int priority = getPriority();

        System.out.println("Nome da Thread: " + name + "\nPrioridade da Thread: " + priority);
    }
}
