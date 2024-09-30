package decepticons;

public class DecepticonRegular extends Decepticon{
    private String rango;
    
    public DecepticonRegular(){
        super();
        ensamblajeFinal();
    }
    
     public String getRango() {
        return rango;
    }

    public void setRango() {
        System.out.println("Ingrese el rango del Decepticon Regular ["+nombre+"]: ");
        rango = lectura.nextLine();
    }
    
    public void ensamblajeFinal(){
        setRango();
    }
    
    public void presentacion(){
        System.out.println("Soy el Decepticon Regular ["+nombre+"], mi código es "+codigo+", mi arma principal es '"+arma+"', mi modo alterno es "+modoAlterno+", mi velocidad es '"+velocidad+"', mi porcentaje de maldad es "+porcentajeMaldad+"% y mi rango es "+rango+".");
        atacar();
    }
    
    @Override
    public void atacar(){
        System.out.println("Mi deber es eliminar a toda la raza humana y proteger al Decepticon Prime Líder.");
    }
}
