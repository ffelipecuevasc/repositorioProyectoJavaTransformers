package autobots;

import java.util.ArrayList;

/**
 *
 * @author ffeli
 */
public class AutobotPrime extends Autobot {

    private Humano protegido;
    private Boolean matrizDeLiderazgo;

    // El método setMatrizDeLiderazgo pide un array, que será entregado por el método ensamblajeFinal(), que también es llamado por su constructor
    public AutobotPrime(ArrayList<AutobotPrime> apC) {
        super();
        ensamblajeFinal(apC);
    }

    public Humano getProtegido() {
        return protegido;
    }

    public void setProtegido() {
        protegido = new Humano();
    }

    public Boolean getMatrizDeLiderazgo() {
        return matrizDeLiderazgo;
    }

    public void setMatrizDeLiderazgo(ArrayList<AutobotPrime> ap) {
        if (ap.isEmpty()) {
            System.out.println("Este sería el primer Autobot Prime ¿desea asignarle la Matriz de Liderazgo? (Si o No): ");
            String respuesta = lectura.nextLine();
            if (respuesta.equalsIgnoreCase("SI")) {
                matrizDeLiderazgo = true;
            } else {
                matrizDeLiderazgo = false;
            }
        } else {
            Boolean existe = false;
            String n = null;
            for (AutobotPrime aux : ap) {
                if (aux.getMatrizDeLiderazgo()) {
                    existe = true;
                    n = aux.getNombre();
                }
            }

            if (existe) {
                System.out.println("Lamentablemente no puede asignar la Matriz de Liderazgo porque la tiene el AutobotPrime [" + n + "].");
                matrizDeLiderazgo = false;
            } else {
                System.out.println("¿Desea asignarle la Matriz de Liderazgo a este Autobot Prime [" + nombre + "]? (Si o No)");
                String respuesta = lectura.nextLine();
                if (respuesta.equalsIgnoreCase("SI")) {
                    matrizDeLiderazgo = true;
                } else {
                    matrizDeLiderazgo = false;
                }
            }
        }
    }

    public void ensamblajeFinal(ArrayList<AutobotPrime> apEF) {
        setProtegido();
        setMatrizDeLiderazgo(apEF);
    }

    public void presentacion() {
        System.out.println("Soy el Autobot Prime ["+nombre+"], mi código es "+codigo+", mi arma principal es '"+arma+"', mi modo alterno es "+modoAlterno+" y mi velocidad es '"+velocidad+"'.");
        if(matrizDeLiderazgo){
            System.out.println("Además poseo la Matriz de Liderazgo ¡Soy el Líder!");
        }else{
            System.out.println("No poseo la Matriz de Liderazgo, no soy el Líder.");
        }
        System.out.println(protegido.recordatorioAutobot());
        defender();
    }
    
    @Override
    public void defender(){
        System.out.println("Mi principal labor es defender al humano " + protegido.getNombre() + ".");
    }
}
