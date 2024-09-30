package autobots;

public class AutobotRegular extends Autobot{
    private String rango;
    
    public AutobotRegular(){
        super();
        ensamblajeFinal();
    }

    public String getRango() {
        return rango;
    }

    public void setRango() {
        System.out.println("Ingrese el rango del Autobot Regular ["+nombre+"]: ");
        rango = lectura.nextLine();
    }
    
    public void ensamblajeFinal(){
        setRango();
    }
    
    public void presentacion(){
        System.out.println("Soy el Autobot Regular ["+nombre+"], mi código es "+codigo+", mi arma principal es '"+arma+"', mi modo alterno es "+modoAlterno+", mi velocidad es '"+velocidad+"' y mi rango es "+rango+".");
        defender();
    }
    
    @Override
    public void defender(){
        System.out.println("Mi deber es defender a toda la raza humana y proteger al Autobot Prime Líder.");
    }
}
