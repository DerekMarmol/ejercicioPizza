package Pizzeria;

abstract class Pizza {
    protected String nombre;
    protected String tamaño;
    protected double precio;
    protected Masa masa;
    protected Salsa salsa;
    protected Queso queso;

    public Pizza(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.masa = masa;
        this.salsa = salsa;
        this.queso = queso;
    }

    public abstract void preparar();
    public abstract void hornear();
    public abstract void cortar();
    public abstract void empacar();

    public String getNombre() {
        return nombre;
    }
}
