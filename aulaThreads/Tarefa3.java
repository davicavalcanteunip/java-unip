package aulaThreads;

public class Tarefa3 extends Thread{

    public Tarefa3(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println("Fluxo de programa \"3\"\n");

        String name = getName();
        int priority = getPriority();

        System.out.println("Nome da Thread: " + name + "\nPrioridade da Thread: " + priority);
    }
}
