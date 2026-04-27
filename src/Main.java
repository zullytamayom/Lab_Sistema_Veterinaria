import veterinaria.*;


public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Perro("Firulais",2,"Yeison","Beagle");
        Animal animal2 = new Gato("Michi",1,"Yesica",true);
        Animal animal3 = new Ave("Piolin",1,"Jhony",200);


       animal1.imprimirFichas();
       animal2.imprimirFichas();
       animal3.imprimirFichas();

        ((Vacunable) animal1).registrarVacuna("Rabia");
        ((Vacunable) animal1).registrarVacuna("Distemper");

        ((Vacunable) animal2).registrarVacuna("Parvovirus");
        ((Vacunable) animal2).registrarVacuna("Leucemia Felina");


        System.out.println("Vacunas del perro: " + ((Vacunable) animal1).getVacunasAplicadas());
        System.out.println("Vacunas del gato: " + ((Vacunable) animal2).getVacunasAplicadas());

    }
}