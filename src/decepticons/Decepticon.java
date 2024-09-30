package decepticons;
import interfaces.ITransformer;

public abstract class Decepticon implements ITransformer{
    protected Integer codigo, velocidad, porcentajeMaldad;
    protected String nombre, arma, modoAlterno;
    
    public Decepticon(){
        autoEnsamblaje();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese el código del Decepticon: ");
        codigo = lectura.nextInt();
        lectura.nextLine();
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad() {
        System.out.println("Ingrese la velocidad del Decepticon ["+nombre+"]: ");
        velocidad = lectura.nextInt();
        lectura.nextLine();
    }

    public Integer getPorcentajeMaldad() {
        return porcentajeMaldad;
    }

    public void setPorcentajeMaldad() {
        System.out.println("Ingrese el porcentaje de maldad del Decepticon ["+nombre+"]: ");
        porcentajeMaldad = lectura.nextInt();
        lectura.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre del Decepticon: ");
        nombre = lectura.nextLine();
    }

    public String getArma() {
        return arma;
    }

    public void setArma() {
        System.out.println("Ingrese el arma del Decepticon ["+nombre+"]: ");
        arma = lectura.nextLine();
    }

    public String getModoAlterno() {
        return modoAlterno;
    }

    public void setModoAlterno() {
        System.out.println("Ingrese el modo alterno del Decepticon ["+nombre+"]: ");
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
    
    public abstract void atacar();
}
