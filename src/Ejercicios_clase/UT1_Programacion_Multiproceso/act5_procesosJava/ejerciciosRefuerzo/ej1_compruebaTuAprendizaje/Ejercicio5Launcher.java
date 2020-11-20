package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.ejerciciosRefuerzo.ej1_compruebaTuAprendizaje;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio5Launcher {
    public static void main(String[] args) throws IOException {

        //este directorio es en el workspace de intelliJ en linux
        File directorio = new File("./out/production/psp-2021/");

        //El proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java", "compruebaTuAprendizaje.Ejercicio5");

        //se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);

       // System.out.printf("Directorio de trabajo: %s%n",pb.directory());

        //se ejecuta el proceso
        Process p = pb.start();

        //obtener la salida devuelta por el proceso
        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    }

