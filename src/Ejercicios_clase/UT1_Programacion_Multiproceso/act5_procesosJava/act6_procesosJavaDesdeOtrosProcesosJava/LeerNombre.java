/**
 * 
 */
package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.act6_procesosJavaDesdeOtrosProcesosJava;


/**
 * @author Vic
 *
 */
public class LeerNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = args[0];
		
		if(nombre==null){

			System.out.println("ERROR");
			System.exit(-1);
			
		} else {
			
			System.out.println("NOMBRE: "+nombre);
			System.exit(1);
		}
		
		
		
	}

}
