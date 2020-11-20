package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.ejerciciosRefuerzo.ej1_compruebaTuAprendizaje;

public class Ejercicio4 {

    public static void main(String[] args) {


        if (args.length < 1) {
            System.out.println("Empty args");
            System.exit(1);
        } else {

            for (String s : args) {


                if (s.matches("^\\d+(\\.\\d+)?")) {

                    int num = Integer.parseInt(s);

                    if (num == Math.round(num) && num < 0) {


                        System.out.println(s);
                        System.exit(3);
                    } else {

                        System.out.println("Default");
                        System.out.println(s);
                        System.exit(0);
                    }


                } else if (!(s.matches("^\\d+(\\.\\d+)?"))) {

                    System.out.println("Cadena: " + s);
                    System.exit(2);

                } else {

                    System.out.println("Default: ");
                    System.out.println(s);
                    System.exit(0);
                }


                System.out.println(s);
            }
        }

    }

}
