package Models;

public class Producto {
    private int id;
    private String nombre;
    private int stock;

    public Producto(int id, String nombre, int stock){
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }
}
