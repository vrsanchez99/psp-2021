package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.act6_procesosJavaDesdeOtrosProcesosJava;



import java.io.*;

public class Ejemplo3 {
  public static void main(String[] args) throws IOException {

	//creamos objeto File al directorio donde esta Ejemplo2

	  //este directorio es en el workspace de intelliJ en linux
	File directorio = new File("/home/vic/IdeaProjects/psp-2021/src/Ejercicios_clase/act5_procesosJava");

	//El proceso a ejecutar es Ejemplo2			
	ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo2");

    //se establece el directorio donde se encuentra el ejecutable
    pb.directory(directorio);
        
	System.out.printf("Directorio de trabajo: %s%n",pb.directory());

    //se ejecuta el proceso
	Process p = pb.start();

   //obtener la salida devuelta por el proceso
	try {
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1)
			System.out.print((char) c);
		is.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
		
  }
}// Ejemplo3
