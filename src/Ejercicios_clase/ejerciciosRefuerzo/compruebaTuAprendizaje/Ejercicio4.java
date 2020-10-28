package Ejercicios_clase.ejerciciosRefuerzo.compruebaTuAprendizaje;

public class Ejercicio4 {

    public static void main(String[] args) {


        if (args.length < 1) {
            System.out.println("Empty args");
            System.exit(1);
        } else {

            for (String s : args) {

                int num = Integer.parseInt(s);

                if (s.matches("^\\d+(\\.\\d+)?")) {


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
