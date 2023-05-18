import java.util.ArrayList;
import java.util.List;

public class Fruteria {
    private String nombre;

    private List<Fruta> frutas;

    public Fruteria() {
        this.frutas = new ArrayList<>();
        this.nombre = "sin nombre";
    }

    public Fruteria(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
    }

    public void agregarfruta(String nombreFruta, int precio, int cantidad){
        Fruta fruta = new Fruta(nombreFruta, precio, cantidad);
        frutas.add(fruta);
    }
    public void eliminarfruta(Fruta fruta){
        frutas.remove(fruta);
    }
    public void eliminarfruta(String nombre){
        for (int i = 0; i < frutas.size(); i++) {
            if (nombre.equals(frutas.get(i).getNombre())){
                frutas.remove(i);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fruteria(List<Fruta> frutas) {
        this.frutas = frutas;
    }

    public List<Fruta> getFrutas() {
        return frutas;
    }

    public void setFrutas(List<Fruta> frutas) {
        this.frutas = frutas;
    }

    @Override
    public String toString() {
        return "Fruteria{" +
                "nombre='" + nombre + '\'' +
                ", frutas=" + frutas +
                '}';
    }
}
