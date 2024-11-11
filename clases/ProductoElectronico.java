package clases;

public class ProductoElectronico extends Producto {

    public ProductoElectronico(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }
}
