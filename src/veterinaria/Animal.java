package veterinaria;

public abstract class Animal {

    private String nombre;
    private int edad;
    private String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public abstract double calcularCostoConsulta();

    public abstract double calcularPrimaSeguro();

    public abstract void imprimirFichas();
}
