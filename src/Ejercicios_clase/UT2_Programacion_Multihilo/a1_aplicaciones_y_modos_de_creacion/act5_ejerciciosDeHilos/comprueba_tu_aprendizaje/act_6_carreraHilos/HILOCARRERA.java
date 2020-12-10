package Ejercicios_clase.UT2_Programacion_Multihilo.a1_aplicaciones_y_modos_de_creacion.act5_ejerciciosDeHilos.comprueba_tu_aprendizaje.act_6_carreraHilos;

class HILOCARRERA extends Thread {
	
	private boolean stopHilo = false;
	int c = 0;
	double tiempo;

	HILOCARRERA(String nombre, double d) {
		this.setName(nombre);
		this.tiempo = d;
	}

	public void pararHilo() {
		stopHilo = true;
	}

	int getContador() {
		return c;
	}

	

	public void run() {
		try {
			while (!stopHilo) {
				c++;
				sleep((long) tiempo);
				
			}
		} catch (InterruptedException exception) {
		}
		System.out.println("Fin hilo: " + getName());
	}
}// HILO