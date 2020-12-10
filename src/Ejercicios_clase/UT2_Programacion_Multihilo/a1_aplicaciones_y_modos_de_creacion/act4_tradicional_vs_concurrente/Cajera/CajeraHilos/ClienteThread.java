package Ejercicios_clase.UT2_Programacion_Multihilo.a1_aplicaciones_y_modos_de_creacion.act4_tradicional_vs_concurrente.Cajera.CajeraHilos;

public class ClienteThread {

    private String nombre;
    private int[] carroCompra;

    // Constructor, getter y setter


    public ClienteThread(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    public ClienteThread() {
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }

}