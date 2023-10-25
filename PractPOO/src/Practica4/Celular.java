package Practica4;

public class Celular extends dispositivoMovil{
    private String numero;
    
    public Celular(String numero){
        super(0);
        this.numero=numero;
    }
    public void llamar(String numero){
        System.out.println("llamando...."+ numero);
        
    }

    public void encender(){
        super.encender();
        System.out.println("No quiero apagarme.! :D");
    }
    
}
