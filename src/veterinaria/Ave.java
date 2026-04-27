package veterinaria;

public class Ave extends Animal{
    private double pesoGramo;

    public Ave(String nombre, int edad, String nombreDueno, double pesoGramo) {
        super(nombre, edad, nombreDueno);
        this.pesoGramo = pesoGramo;
    }

    @Override
    public double calcularCostoConsulta() {
        return 28000 + (pesoGramo *500);
    }

    @Override
    public double calcularPrimaSeguro() {
        return 0;
    }

    @Override
    public void imprimirFichas() {
        System.out.println("Nombre : " + getNombre()+
                          "Edad : "+ getEdad() +
                          "Dueño : "+ getNombreDueno() +
                          "Peso : " + pesoGramo +
                          "Costo de la consulta : " + calcularCostoConsulta());
    }
}
