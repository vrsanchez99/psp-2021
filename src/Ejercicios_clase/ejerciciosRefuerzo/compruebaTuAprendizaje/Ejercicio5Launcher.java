package Ejercicios_clase.ejerciciosRefuerzo.compruebaTuAprendizaje;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5Launcher {
    public static void main(String[] args) {
        Ejercicio5.main(args);

        File file = new File("salida.txt");

        if(args[0]!=null) {
            try {
                FileWriter fw = new FileWriter(file);
                fw.write(args[0]);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
