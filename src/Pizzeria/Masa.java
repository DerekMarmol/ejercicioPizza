package Pizzeria;

class Masa implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Masa(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Masa " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
