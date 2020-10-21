package Ejercicios_clase.act5_procesosJava;


import java.io.IOException;

public class Ejemplo1 {
   public static void main(String[] args) throws IOException  {	   
	   ProcessBuilder pb = new ProcessBuilder("Spotify");
	   Process p = pb.start();

   }
}//Ejemplo1

