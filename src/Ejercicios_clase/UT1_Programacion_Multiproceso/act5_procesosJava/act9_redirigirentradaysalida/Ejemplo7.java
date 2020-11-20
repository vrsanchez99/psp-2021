package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.act9_redirigirentradaysalida;

import java.io.File;
import java.io.IOException;

public class Ejemplo7 {
    public static void main(String args[]) throws IOException {

        //windows
        //ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");

        //Linux
        ProcessBuilder pb = new ProcessBuilder("ls /home/IdeaProjects/");

        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");

        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        pb.start();
    }
}// Ejemplo7