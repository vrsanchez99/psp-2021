package Ejercicios_clase.act9_redirigirentradaysalida;

import java.io.File;
import java.io.IOException;

public class Ejemplo8 {
    public static void main(String args[]) throws IOException {

        //windows
        ProcessBuilder pb = new ProcessBuilder("CMD");

        File fBat = new File("fichero.sh");
        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");

        pb.redirectInput(fBat);
        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        pb.start();

    }
}// Ejemplo8