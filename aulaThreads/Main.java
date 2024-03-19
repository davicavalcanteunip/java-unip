package aulaThreads;

public class Main {
    public static void main(String[] args) {
        Tarefa3 T3 = new Tarefa3("Thread 3");
        T3.setPriority(4);
        T3.start();

        Tarefa4 T4 = new Tarefa4("Thread 4");
        T4.setPriority(6);
        T4.start();

        Tarefa5 T5 = new Tarefa5("Thread 5");
        T5.setPriority(8);
        T5.start();
    }
}