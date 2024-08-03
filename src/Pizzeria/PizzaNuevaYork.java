package Pizzeria;

class PizzaNuevaYork extends Pizza {
    private String estiloCorte;

    public PizzaNuevaYork(String nombre, String tamaño, double precio, Masa masa, Salsa salsa, Queso queso, String estiloCorte) {
        super(nombre, tamaño, precio, masa, salsa, queso);
        this.estiloCorte = estiloCorte;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Nueva York");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza estilo Nueva York");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza en estilo " + estiloCorte);
    }

    @Override
    public void empacar() {
        System.out.println("Empacando pizza estilo Nueva York");
    }
}

