package Practica4;

public class dispositivoMovil {
	
	protected float velocidadProcesador;
	protected int cargaBateria;
	protected int memoria;
	protected String sistemaOperativo;
	protected String marca;
	protected String modelo;
	
	public void encender() {
		System.out.println("Starting up...");		
	}
	
	public final void apagar() {
		System.out.println("Shutting down...");
	}
	
	public int verCargaBateria() {
		System.out.println("Queda un " + cargaBateria + "% de bateria.");
		return cargaBateria;
	}
	
	public dispositivoMovil (int x){
	    System.out.println("Haré que laptop deje de funcionar.! :D");
	}
}
