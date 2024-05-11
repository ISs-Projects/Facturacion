package modelo.entidades;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public class ClienteImpl implements Cliente {

    private String DNI;
    private String nombre;
    private String direccion;


    public ClienteImpl(String dni,String nombre,String direccion){
        this.DNI = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String getDNI() {
        return DNI;
    }

    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
