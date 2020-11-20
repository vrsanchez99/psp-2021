package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.ejerciciosRefuerzo.ej5_compilador;

import java.io.*;

public class Launcher {
    public static void main(String[] args) throws Exception {
        try {
            compiler("javac Mensaje.java");
            compiler("java Mensaje");
        } catch (Exception e) {

            FileOutputStream fos = new FileOutputStream("salidaErrorCompilacion.txt");
            PrintWriter pw = new PrintWriter(fos);
            pw.write("Mensaje de error de compilacion: " + e.getMessage() + ".\n" +
                    e.getLocalizedMessage());
            e.printStackTrace();
            pw.flush();
            fos.close();
            pw.close();
        }
    }


    /**
     * @param command
     * @throws Exception
     * @throws IOException
     */
    public static void compiler(String command) throws Exception, IOException {

        Process pro = Runtime.getRuntime().exec(command);
        saveLogInFile(command + " stdout:", pro.getInputStream(), "salidaEjecucion.txt");
        saveLogInFile(command + " stderr:", pro.getErrorStream(), "salidaErroresEjecucion.txt");
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());

    }

    /**
     * @param msg
     * @param isr
     * @throws Exception
     * @throws IOException
     */
    public static void saveLogInFile(String msg, InputStream isr, String fileName) throws Exception, IOException {

        //PrintStream printStream = new PrintStream(new FileOutputStream(fileName));
        //System.setOut(printStream);

        FileOutputStream fos = new FileOutputStream(fileName);
        PrintWriter pw = new PrintWriter(fos);

        String line = null;
        BufferedReader in = new BufferedReader(
                new InputStreamReader(isr));
        while ((line = in.readLine()) != null) {
            pw.write(line);
            System.out.println(msg + " " + line);
        }

        pw.flush();
        fos.close();
        pw.close();
    }
}
