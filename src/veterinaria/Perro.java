package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements Vacunable,Asegurable{
    private String raza;
    private List<String> vacunas = new ArrayList<>();

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {

        return 45000 + (edad * 3000) ;
    }

    @Override
    public double calcularPrimaSeguro(){
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "242325";
    }

    @Override
    public void imprimirFichas() {
        super.imprimirFichas();
        System.out.println("Raza : " + raza);
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunas.add(nombreVacuna);
        System.out.println("Vacuna '" + nombreVacuna + "' registrada para el perro.");
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }
}

