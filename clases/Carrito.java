package clases;

public class Carrito<T extends Producto> {
    private T[] productos;
    private int indice;

    public Carrito(int capacidad) {
        productos = (T[]) new Producto[capacidad];
        indice = 0;
    }

    public void agregarProducto(T producto) {
        if (indice < productos.length) {
            productos[indice++] = producto;
        } else {
            throw new IllegalStateException("Carrito lleno, no se puede agregar más productos.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        if (indice == 0) {
            System.out.println("El carrito está vacío.");
        } else {
            for (int i = 0; i < indice; i++) {
                System.out.println("Producto: " + productos[i].getNombre() + ", Precio: " + productos[i].getPrecio());
            }
        }
    }
}
