import veterinaria.Animal;
import veterinaria.Ave;
import veterinaria.Gato;
import veterinaria.Perro;


public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Perro("Firulais",2,"Yeison","Beagle");
        Animal animal2 = new Gato("Michi",1,"Yesica",true);
        Animal animal3 = new Ave("Piolin",1,"Jhony",200);


       animal1.imprimirFichas();
       animal2.imprimirFichas();
       animal3.imprimirFichas();

    }
}