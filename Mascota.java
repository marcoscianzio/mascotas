import java.util.concurrent.atomic.AtomicInteger;

public class Mascota {
    private static AtomicInteger count = new AtomicInteger(0);
    private int idMascota;
    private String nombre;
    private int cantidadDePatas;

    public Mascota(String nombre, int cantidadDePatas) {
        this.idMascota = count.incrementAndGet(); 
        this.nombre = nombre;
        this.cantidadDePatas = cantidadDePatas;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDePatas() {
        return cantidadDePatas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadDePatas(int cantidadDePatas) {
        this.cantidadDePatas = cantidadDePatas;
    }

    @Override
    public String toString() {
        return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", cantidadDePatas=" + cantidadDePatas + "]";
    }
    
}
