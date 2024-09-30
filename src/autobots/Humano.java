package autobots;
import java.util.Scanner;

public class Humano {
    private String run, nombre, prioridad;
    private Integer edad;
    private Scanner leer;
    
    public Humano(){
        leer = new Scanner(System.in);
        setRun();
        setNombre();
        setEdad();
        setPrioridad();
    }

    public String recordatorioAutobot(){
        return "¡Oye, recuerda que me debes proteger! Soy el humano " + nombre + " [RUN - "+run+", EDAD - "+edad+", PRIORIDAD - "+prioridad+"]";
    }
    
    public String getRun() {
        return run;
    }

    public void setRun() {
        System.out.println("Ingrese el RUN del humano: ");
        run = leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre del humano: ");
        nombre = leer.nextLine();
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad() {
        System.out.println("Ingrese la prioridad del humano: ");
        prioridad = leer.nextLine();
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad() {
        System.out.println("Ingrese la edad del humano: ");
        edad = leer.nextInt();
        leer.nextLine();
    }
    
}
