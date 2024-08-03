package Pizzeria;

class Salsa implements Ingrediente {
    private String sabor;
    private int cantidad;

    public Salsa(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Salsa " + sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
