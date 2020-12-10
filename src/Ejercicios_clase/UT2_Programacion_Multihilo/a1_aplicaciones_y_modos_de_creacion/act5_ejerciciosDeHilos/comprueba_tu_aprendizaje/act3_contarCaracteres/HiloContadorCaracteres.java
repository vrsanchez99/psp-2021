package Ejercicios_clase.UT2_Programacion_Multihilo.a1_aplicaciones_y_modos_de_creacion.act5_ejerciciosDeHilos.comprueba_tu_aprendizaje.act3_contarCaracteres;

import java.io.BufferedReader;
import java.io.FileReader;

public class HiloContadorCaracteres extends Thread {

    String fichero;
    int numCaracteres=0;

    public HiloContadorCaracteres(String fichero) {
        this.fichero = fichero;
    }


    @Override
    public void run() {

       setNumCaracteres(countCharacters(fichero));

    }

    /**
     *
     * @param file
     * @return
     */
    public int countCharacters(String file) {

        String linea = "";
        int numCaracteres = 0;
//
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            //
            while ((linea = br.readLine()) != null) {

                //Ignora los espacios en blancos, y líneas vacías también.
                String[] palabras = linea.replaceAll("\\s+", " ").split(" ");

                for (String s : palabras) {
                    numCaracteres += s.length();
                }

            }
            System.out.println("Num caracteres:" +numCaracteres);
            return numCaracteres;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getNumCaracteres() {
        System.out.println("caracteres del objeto: "+this.numCaracteres);
        return numCaracteres;

    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
        System.out.println("caracteres recibidos: "+numCaracteres);
        System.out.println("caracteres del objeto: "+getNumCaracteres());
    }


}
