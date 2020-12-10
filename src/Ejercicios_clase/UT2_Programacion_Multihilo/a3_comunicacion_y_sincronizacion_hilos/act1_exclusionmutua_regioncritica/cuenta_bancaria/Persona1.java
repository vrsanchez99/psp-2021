package Ejercicios_clase.UT2_Programacion_Multihilo.a3_comunicacion_y_sincronizacion_hilos.act1_exclusionmutua_regioncritica.cuenta_bancaria;

public class Persona1 extends Thread{

    private String nombre;
    private Cuenta cuenta;

    public Persona1(String nombre, Cuenta cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void run() {
        cuenta.hacerIngreso(((int) (Math.random()*500+1)));
    }
}
