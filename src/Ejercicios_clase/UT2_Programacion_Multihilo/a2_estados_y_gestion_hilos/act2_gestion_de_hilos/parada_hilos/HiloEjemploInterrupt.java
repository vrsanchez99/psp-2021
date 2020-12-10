package Ejercicios_clase.UT2_Programacion_Multihilo.a2_estados_y_gestion_hilos.act2_gestion_de_hilos.parada_hilos;

import Ejercicios_clase.UT2_Programacion_Multihilo.a2_estados_y_gestion_hilos.act1_estados_de_un_hilo.HiloEjemploDead;

public class HiloEjemploInterrupt extends Thread {

    @Override
    public void run() {
        try {

            System.out.println("EN EL HILO");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Ha ocurrido una excepcion!");
        }

        System.out.println("FIN HILO");
    }

    public void interrumpir() {
        interrupt();
    }

    public static void main(String[] args) {

        HiloEjemploInterrupt hiloEjemploInterrupt = new HiloEjemploInterrupt();
        hiloEjemploInterrupt.start();
        for (int i = 0; i < 1000000; i++) ;
        hiloEjemploInterrupt.interrumpir();

    }
}
