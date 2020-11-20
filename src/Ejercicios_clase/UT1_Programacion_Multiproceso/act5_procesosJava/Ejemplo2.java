package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava;



import java.io.*;

public class Ejemplo2 {
	public static void main(String[] args) throws IOException {

		//Para windows
		//ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");

		//Para linux
		Process p = new ProcessBuilder("gedit", "usr/bin").start();
		try {

			InputStream is = p.getInputStream();

			// mostramos en pantalla caracter a caracter
			 int c;
			 while ((c = is.read()) != -1)
				System.out.print((char) c);
			 is.close();

		
		} catch (Exception e) {
			e.printStackTrace();
		}

		// COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}// Ejemplo2
