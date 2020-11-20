package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.act9_redirigirentradaysalida;

import java.io.File;
import java.io.IOException;

public class Act_1_7 {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("bash");

        File fBat = new File("fichero.bat");
        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");

        pb.redirectInput(ProcessBuilder.Redirect.from(fBat));
        pb.redirectOutput(ProcessBuilder.Redirect.to(fOut));
        pb.redirectError(ProcessBuilder.Redirect.to(fErr));
        try {
        pb.start();}catch(IOException ioe){ioe.getMessage();};
    }


}
