package exercise4;

public class SimpleThreadWithMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Counter variableA;
        variableA = new Counter();
        new Thread(variableA).start();
        new Thread(variableA).start();
        new Thread(variableA).start();
        new Thread(variableA).start();
        new Thread(variableA).start();
        new Thread(variableA).start();
    }

}