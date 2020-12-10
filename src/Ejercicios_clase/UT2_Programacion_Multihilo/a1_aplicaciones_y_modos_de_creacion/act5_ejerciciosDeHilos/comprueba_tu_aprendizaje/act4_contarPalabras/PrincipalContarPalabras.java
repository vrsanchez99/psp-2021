package Ejercicios_clase.UT2_Programacion_Multihilo.a1_aplicaciones_y_modos_de_creacion.act5_ejerciciosDeHilos.comprueba_tu_aprendizaje.act4_contarPalabras;

public class PrincipalContarPalabras {
    public static void main(String[] args) {



        long t_comienzo=0, t_fin=0, t_total=0;


        HiloContadorPalabras hilo;

        for(int i=0; i < args.length;i++){

            System.out.println("Ejecutando hilo "+(i+1)+"...");
            System.out.println("Contando palabras del fichero "+(i+1)+"...\n");

            t_comienzo = System.currentTimeMillis();
            hilo = new HiloContadorPalabras(args[i]);
            hilo.start();
            t_fin = System.currentTimeMillis();
            t_total = t_fin - t_comienzo;

            System.out.println("El fichero "+(i+1)+" contiene "+hilo.getNumPalabras()+" palabras.");
            System.out.println("El proceso ha tardado: "+ t_total + " milisegundos.\n "+"- - - - - - - ");

        }


    }
}
