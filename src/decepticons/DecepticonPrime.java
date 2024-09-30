package decepticons;
import java.util.ArrayList;
import autobots.AutobotPrime;

public class DecepticonPrime extends Decepticon{
    private Integer desprecioHumanos;
    private String archienemigo;
    
    public DecepticonPrime(ArrayList<AutobotPrime> ap){
        super();
        ensamblajeFinal(ap);
    }

    public Integer getDesprecioHumanos() {
        return desprecioHumanos;
    }

    public void setDesprecioHumanos() {
        System.out.println("Ingrese el porcentaje de desprecio a los humanos del Decepticon Prime ["+nombre+"]: ");
        desprecioHumanos = lectura.nextInt();
        lectura.nextLine();
    }

    public String getArchienemigo() {
        return archienemigo;
    }

    public void setArchienemigo(ArrayList<AutobotPrime> ap) {
        System.out.println("Listado de archienemigos posibles");
        System.out.println("---------------------------------");
        for(AutobotPrime aux : ap){
            System.out.println("Autobot Prime - " + aux.getNombre());
            System.out.println("---------------------------------");
        }
        System.out.println("Ingrese el Autobot Prime que será el Archienemigo del Decepticon Prime ["+nombre+"]:");
        archienemigo = lectura.nextLine();
    }
    
    public void ensamblajeFinal(ArrayList<AutobotPrime> ap){
        setDesprecioHumanos();
        setArchienemigo(ap);
    }
    
    public void presentacion(){
      System.out.println("Soy el Decepticon Prime ["+nombre+"], mi código es "+codigo+", mi arma principal es '"+arma+"', mi modo alterno es "+modoAlterno+" y mi velocidad es '"+velocidad+"'.");  
      System.out.println("Además mi porcentaje de maldad es " +porcentajeMaldad+ "%, mi porcentaje de despecio a humanos es "+desprecioHumanos+"% y mi archienemigo es el Autobot Prime ["+archienemigo+"].");
    }
    
    @Override
    public void atacar(){
        System.out.println("Mi único propósito es destruir al Autobot Prime ["+archienemigo+"] y además a la raza humana.");
    }
}
