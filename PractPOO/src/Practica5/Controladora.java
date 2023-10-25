package Practica5;



public class Controladora {

	public static void main(String agrs []) {
		new Thread(new Reloj()).start();
		new Thread(new Ejecutor("calc", 0)).start();
		}
		
	}

