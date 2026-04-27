package veterinaria;

public class Gato extends Animal{
    private boolean esEsterilizado;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public double calcularPrimaSeguro() {

        return esEsterilizado ? 120000 : 200000;
    }

}
