package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.ejerciciosRefuerzo.ej7_contabilidad_departamentos;

import java.io.*;

public class ContabilidadDepartamentos {
    public static void main(String[] args) throws Exception {

        String[] ficheros = new String[]{
                "informatica.txt", "gerencia.txt", "contabilidad.txt", "comercio.txt","rrhh.txt"
        };




    }

    /**
     *
     * @param fichero
     * @param total
     * @throws IOException
     */
    public static void guardarSumaEnFichero(String fichero, int total) throws IOException {

        PrintWriter pw;
        FileWriter fileWriter = new FileWriter(fichero);
        pw = new PrintWriter(fileWriter);
        pw.println(total);
        pw.close();

    }

    /**
     *
     * @param fichero
     * @return
     * @throws Exception
     */
    public static int sumadorValoresFichero(String fichero) throws Exception{

        BufferedReader bfr = new BufferedReader(new FileReader(fichero));
        String linea = bfr.readLine();
        int suma=0, total=0;
        while (linea != null) {
            suma = Integer.parseInt(linea);
            total+=suma;

        }

        return total;
    }


    /**
     *
     * @param ficheros
     */
    public static void procesos(String[] ficheros){

        ProcessBuilder[] procesos = new ProcessBuilder[ficheros.length];

        for(int i=0; i< procesos.length; i++){

            procesos[i] = new ProcessBuilder();
            procesos[i].command();


        }



    }

}
