package Practica4Modif;

public class Tableta extends DispositivoMovil {
  
	public Tableta(){
		super(0);
		cargaBateria = 85;
	}

	public void bienvenida() {
		System.out.println("Bienvenidos a nuestro sistema.! :D");
		
	}
	public void saludo() {
		System.out.println("Hola.!, que novedades tienes el dia de hoy? :");
	}
	
}
