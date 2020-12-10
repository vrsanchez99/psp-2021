package Ejercicios_clase.UT2_Programacion_Multihilo.a2_estados_y_gestion_hilos.act2_gestion_de_hilos.parada_hilos;

public class EjemploJoin {
    public static void main(String[] args) {
        HiloJoin h1 = new HiloJoin("Hilo1", 2);
        HiloJoin h2 = new HiloJoin("Hilo2", 5);
        HiloJoin h3 = new HiloJoin("Hilo3", 7);

        h1.start();
        h2.start();
        h3.start();

        try {

            h1.join();h2.join();h3.join();
        }catch(InterruptedException e){
            System.out.println("FINAL DEL PROGRAMA");
        }
    }
}

class HiloJoin extends Thread {

    private int n;

    public HiloJoin(String nombre, int n) {
        super(nombre);
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i < n; i++) {
            System.out.println(getName() + ": " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Fin bucle" + getName());

    }
}