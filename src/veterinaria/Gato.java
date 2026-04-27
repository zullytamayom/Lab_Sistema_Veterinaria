package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Vacunable,Asegurable{
    private boolean esEsterilizado;
    private List<String> vacunas = new ArrayList<>();

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

    @Override
    public String obtenerNumeroPoliza() {
        return "123";
    }

    @Override
    public void imprimirFichas() {
        super.imprimirFichas();
        System.out.println("Esterilizado : " + esEsterilizado);
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunas.add(nombreVacuna);
        System.out.println("Vacuna '" + nombreVacuna + "' registrada para el gato.");

    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }
}


