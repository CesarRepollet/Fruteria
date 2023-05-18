public class Main {
    public static void main(String[] args) {
        Fruteria fruteria_paco = new Fruteria();
        Fruta fruta1 = new Fruta("manzana", 5, 50);
        Fruta fruta2 = new Fruta("pera", 4, 30);
        Fruta fruta3 = new Fruta("naranja", 6, 40);
        fruteria_paco.getFrutas().add(fruta1);
        fruteria_paco.getFrutas().add(fruta2);
        fruteria_paco.getFrutas().add(fruta3);
        fruteria_paco.getFrutas().remove(fruta1);
        fruteria_paco.agregarfruta("Platano", 7, 60);
        fruteria_paco.eliminarfruta(fruta2);
        System.out.println(fruteria_paco);
        fruteria_paco.eliminarfruta("naranja");
        System.out.println(fruteria_paco);
    }
}