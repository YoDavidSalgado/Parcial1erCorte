interface Autos {
    void acelerar();
    double calcularVelocidad();
}


abstract class Marca implements Autos {
    private String nombre;
    private int velocidad;

    public Marca(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }


    public void acelerar() {
        System.out.println("La velocidad maxima es: ");
    }
}


class Ferrari extends Marca {
    private double velocidadInicial;


    public Ferrari(String nombre, int velocidad, double velocidadInicial) {
        super(nombre, velocidad);
        this.velocidadInicial = velocidadInicial;
    }


    public double calcularVelocidad() {
        return velocidadInicial * 2.2;
    }
}


class Ford extends Marca {
    private double velocidadInicial;


    public Ford(String nombre, int velocidad, double velocidadInicial) {
        super(nombre, velocidad);
        this.velocidadInicial = velocidadInicial;
    }


    public double calcularVelocidad() {
        return velocidadInicial * 1.5;
    }
}

public class GestionAutos {
    public static void main(String[] args) {

        Marca Ferrari = new Ferrari("Ferrari X2", 120, 50);
        Marca Ford = new Ford("Ford 588", 180, 40);


        Ferrari.Marca();
        System.out.println("La velocidad final es: " + Ferrari.calcularVelocidad()+" Km/h");

        Ford.Marca();
        System.out.println("La velocidad final es: " + Ford.calcularVelocidad()+" Km/h");
    }
}
