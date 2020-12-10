package Ejercicios_clase.UT2_Programacion_Multihilo.a2_estados_y_gestion_hilos.act1_estados_de_un_hilo;

public class HiloEjemploDead extends Thread{

    public static void main(String[] args) {

        HiloEjemploDead hiloEjemploDead = new HiloEjemploDead();

        hiloEjemploDead.start();
        for(int i=0; i < 1000000; i++);
        hiloEjemploDead.pararHilo();

    }

    public boolean stopHilo = false;

    public void pararHilo(){
        stopHilo = true;
    }

    @Override
    public void run() {
        while(!stopHilo){
            System.out.println("En el hilo");
        }
    }
}
