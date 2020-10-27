package Ejercicios_clase.ejerciciosRefuerzo.compruebaTuAprendizaje;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio4Launcher {
    public static void main(String[] args) throws IOException {


        File directorio = new File("/home/vic/IdeaProjects/psp-2021/src/Ejercicios_clase/ejerciciosRefuerzo/compruebaTuAprendizaje");

        //El proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio4");

        //se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);

        System.out.printf("Directorio de trabajo: %s%n",pb.directory());

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
