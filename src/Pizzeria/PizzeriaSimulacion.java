package Pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PizzeriaSimulacion {
    private static final Random random = new Random();
    private static final String[] NOMBRES = {"Juan", "María", "Pedro", "Ana", "Luis", "Sofía", "Carlos", "Laura"};
    private static final String[] PUESTOS = {"Cocinero", "Cajero", "Repartidor", "Gerente", "Ayudante de cocina"};
    private static final String[] TIPOS_MASA = {"fina", "gruesa", "integral", "sin gluten"};
    private static final String[] SABORES_SALSA = {"tomate", "barbacoa", "pesto", "ajo"};
    private static final String[] TIPOS_QUESO = {"mozzarella", "cheddar", "parmesano", "gouda"};
    private static final String[] TAMANIOS = {"Pequeña", "Mediana", "Grande", "Familiar"};
    private static final String[] ESTILOS_CORTE = {"triangular", "cuadrado", "rectangular"};

    public static void main(String[] args) {
        Masa masa = new Masa(getRandomElement(TIPOS_MASA), random.nextInt(100) + 50);
        Salsa salsa = new Salsa(getRandomElement(SABORES_SALSA), random.nextInt(50) + 25);
        Queso queso = new Queso(getRandomElement(TIPOS_QUESO), random.nextInt(75) + 50);

        PizzaNuevaYork pizzaNY = new PizzaNuevaYork(
                "Pizza NY " + getRandomElement(TIPOS_MASA),
                getRandomElement(TAMANIOS),
                getRandomPrice(10, 20),
                masa, salsa, queso,
                getRandomElement(ESTILOS_CORTE)
        );

        PizzaChicago pizzaChicago = new PizzaChicago(
                "Pizza Chicago " + getRandomElement(TIPOS_MASA),
                getRandomElement(TAMANIOS),
                getRandomPrice(12, 22),
                masa, salsa, queso,
                random.nextInt(3) + 1
        );

        Sucursal sucursalCentral = new Sucursal("Pizzería Central", "Calle Principal " + (random.nextInt(100) + 1));

        int numEmpleados = random.nextInt(5) + 2;  // 2 a 6 empleados
        for (int i = 0; i < numEmpleados; i++) {
            sucursalCentral.agregarEmpleado(new Empleado(
                    getRandomElement(NOMBRES),
                    getRandomElement(PUESTOS),
                    getRandomPrice(1000, 3000)
            ));
        }

        sucursalCentral.agregarIngrediente(masa);
        sucursalCentral.agregarIngrediente(salsa);
        sucursalCentral.agregarIngrediente(queso);

        sucursalCentral.agregarEquipo(new Equipo("Horno"));

        sucursalCentral.agregarEspecialidad(pizzaNY);
        sucursalCentral.agregarEspecialidad(pizzaChicago);

        System.out.println("Bienvenido a la " + sucursalCentral.getNombre() + " en " + sucursalCentral.getDireccion());
        System.out.println("Empleados de hoy:");
        for (Empleado emp : sucursalCentral.getEmpleados()) {
            System.out.println("- " + emp.getNombre() + " (" + emp.getPuesto() + ")");
        }

        System.out.println("\nPreparando una " + pizzaNY.getNombre() + ":");
        pizzaNY.preparar();
        pizzaNY.hornear();
        pizzaNY.cortar();
        pizzaNY.empacar();

        System.out.println("\nPreparando una " + pizzaChicago.getNombre() + ":");
        pizzaChicago.preparar();
        pizzaChicago.hornear();
        pizzaChicago.cortar();
        pizzaChicago.empacar();

        System.out.println("\nInformación de ingredientes:");
        System.out.println(masa.obtenerNombre() + ": " + masa.obtenerCantidad() + " unidades");
        System.out.println(salsa.obtenerNombre() + ": " + salsa.obtenerCantidad() + " unidades");
        System.out.println(queso.obtenerNombre() + ": " + queso.obtenerCantidad() + " unidades");
    }

    private static String getRandomElement(String[] array) {
        return array[random.nextInt(array.length)];
    }

    private static double getRandomPrice(double min, double max) {
        return Math.round((min + (max - min) * random.nextDouble()) * 100.0) / 100.0;
    }
}
