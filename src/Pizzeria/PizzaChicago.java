package Pizzeria;

class PizzaChicago extends Pizza {
    private int grosorMasa;

    public PizzaChicago(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, int grosorMasa) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.grosorMasa = grosorMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Chicago con masa de grosor " + grosorMasa);
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza estilo Chicago");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza estilo Chicago");
    }

    @Override
    public void empacar() {
        System.out.println("Empacando pizza estilo Chicago");
    }
}
