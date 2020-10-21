package Ejercicios_clase.act5_procesosJava;


import java.io.IOException;

public class Ejemplo1 {
   public static void main(String[] args) throws IOException  {

       //Para windows
       //ProcessBuilder pb = new ProcessBuilder("NOTEPAD");

       //Para linux
	   ProcessBuilder pb = new ProcessBuilder("gedit");
	   Process p = pb.start();

   }
}//Ejemplo1

