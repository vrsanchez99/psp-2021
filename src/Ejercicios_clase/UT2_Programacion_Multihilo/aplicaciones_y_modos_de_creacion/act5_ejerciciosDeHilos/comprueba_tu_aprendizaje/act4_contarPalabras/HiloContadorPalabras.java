package Ejercicios_clase.UT2_Programacion_Multihilo.aplicaciones_y_modos_de_creacion.act5_ejerciciosDeHilos.comprueba_tu_aprendizaje.act4_contarPalabras;

import java.io.BufferedReader;
import java.io.FileReader;

public class HiloContadorPalabras extends Thread {

    String fichero;
    int numPalabras = 0;

    public HiloContadorPalabras(String fichero) {
        this.fichero = fichero;
    }

    @Override
    public void run() {
        super.run();

        setNumPalabras(contadorPalabras(fichero));


    }


    /**
     * @param file
     * @return
     */
    public int contadorPalabras(String file) {

        String linea = "";
        int numPalabras = 0;
//
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            //
            while ((linea = br.readLine()) != null) {

                //Ignora los espacios en blancos, y líneas vacías también.
                String[] palabras = linea.replaceAll("\\s+", " ").split(" ");

                numPalabras += palabras.length;

            }

            return numPalabras;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;

    }

    public int getNumPalabras() {
        return numPalabras;
    }

    public void setNumPalabras(int numPalabras) {
        this.numPalabras = numPalabras;
    }
}
