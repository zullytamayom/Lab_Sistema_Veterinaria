package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements Vacunable{
    private String raza;
    private List<String> vacunas = new ArrayList<>();

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {

        return 45000 + (getEdad()* 3000) ;
    }

    @Override
    public double calcularPrimaSeguro(){
        return 80.000 * getEdad();
    }

    @Override
    public void imprimirFichas() {
        System.out.println("Nombre : " + getNombre()+
                "Edad : "+ getEdad() +
                "Dueño : "+ getNombreDueno() +
                "Raza : " + raza +
                "Costo de la consulta : " + calcularCostoConsulta());
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

