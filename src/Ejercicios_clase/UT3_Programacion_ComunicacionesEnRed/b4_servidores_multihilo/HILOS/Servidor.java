package Ejercicios_clase.UT3_Programacion_ComunicacionesEnRed.b4_servidores_multihilo.HILOS;

import java.io.*;
import java.net.*;

public class Servidor {
	public static void main(String args[]) throws IOException  {
		ServerSocket servidor;		
		servidor = new ServerSocket(6000);
		System.out.println("Servidor iniciado...");
		
		while (true) {	
			Socket cliente = new Socket();
			cliente=servidor.accept();//esperando cliente	
			HiloServidor hilo = new HiloServidor(cliente);
			hilo.start();		
		}
	}
}//..