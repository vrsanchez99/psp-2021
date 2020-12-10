package Ejercicios_clase.UT2_Programacion_Multihilo.a1_aplicaciones_y_modos_de_creacion.act4_tradicional_vs_concurrente.Cajera.CajeraHilos;



public class MainThread {

    public static void main(String[] args) {

        ClienteThread cliente1 = new ClienteThread("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        ClienteThread cliente2 = new ClienteThread("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        CajeraThread cajera1 = new CajeraThread ("Cajera 1", cliente1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);

        cajera1.start();
        cajera2.start();
    }
}