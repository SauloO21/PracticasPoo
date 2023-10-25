package Practica4Modif;

public class VideoJuego extends DispositivoMovil {
 
	public VideoJuego() {
		super(0);
		cargaBateria = 93;
		
	}
	
	public void encender(){
        super.encender();
        System.out.println("Es hora de jugar.!!! :D");
    }

	public void saludo() {
		System.out.println("Hola de nuevo.!, que jugaremos hoy? ");
		
	}
	 
	
}
