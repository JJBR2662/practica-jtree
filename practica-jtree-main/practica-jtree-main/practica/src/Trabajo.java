
public class Trabajo {
    private String nombre;
    private boolean hecho;

    public Trabajo(String nombre, boolean hecho) {
        this.nombre = nombre;
        this.hecho = hecho;
    }

    public Trabajo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHecho() {
        return hecho;
    }

    public void setHecho(boolean hecho) {
        this.hecho = hecho;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
