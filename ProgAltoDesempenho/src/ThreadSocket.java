public class ThreadSocket implements Runnable {

    private int cont;
    private String entrada;


    public ThreadSocket(int cont, String entrada) {
        this.cont = cont;
        this.entrada = entrada;

    }

    @Override
    public void run() {
        for (int i = 1; i <= cont; i++) {
            System.out.println("Teste " + i + ": " + entrada);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
