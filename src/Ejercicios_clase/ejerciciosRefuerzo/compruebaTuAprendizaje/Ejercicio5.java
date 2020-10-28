package Ejercicios_clase.ejerciciosRefuerzo.compruebaTuAprendizaje;

public class Ejercicio5 {
    public static void main(String[] args) {


        if (args.length > 0) {
            for (int i = 0; i < 5; i++) {
                System.out.println(args[0]);
            }

        } else {

            System.out.println("Cadena vacia");
            System.exit(1);

        }

    }
}
