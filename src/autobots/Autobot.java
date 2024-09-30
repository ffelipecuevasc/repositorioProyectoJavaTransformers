package autobots;
import interfaces.ITransformer;
/**
 *
 * @author ffeli
 */
public abstract class Autobot implements ITransformer {
    protected Integer codigo, velocidad;
    protected String nombre, arma, modoAlterno;
    
    public Autobot(){
        autoEnsamblaje();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese el código del Autobot: ");
        codigo = lectura.nextInt();
        lectura.nextLine();
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad() {
        System.out.println("Ingrese la velocidad del Autobot ["+nombre+"]: ");
        velocidad = lectura.nextInt();
        lectura.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre del Autobot: ");
        nombre = lectura.nextLine();
    }

    public String getArma() {
        return arma;
    }

    public void setArma() {
        System.out.println("Ingrese el arma del Autobot ["+nombre+"]: ");
        arma = lectura.nextLine();
    }

    public String getModoAlterno() {
        return modoAlterno;
    }

    public void setModoAlterno() {
        System.out.println("Ingrese el modo alterno del Autobot ["+nombre+"]: ");
        modoAlterno = lectura.nextLine();
    }
    
      
    @Override
    public void autoEnsamblaje(){
        setCodigo();
        setNombre();
        setArma();
        setModoAlterno();
        setVelocidad();
    }
    
    //Método abstracto que deberá ser implementado en las clases hijo
    public abstract void defender();
}
