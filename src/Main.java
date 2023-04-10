import controller.AnimalStream;
import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            AnimalStream animalStream = new AnimalStream();
            List<Animal> animais = new ArrayList<>();

            animais.add(new Animal("baleia Branca", "Carnívoro", "Mamífero",11500.0));
            animais.add(new Animal("Humano", "Onívoro", "Mamífero", 70));
            animais.add(new Animal("Lobo", "Carnívoro", "Mamífero", 50));
            animais.add(new Animal("Gazela", "Herbívoro", "Mamífero", 60.56));
            animais.add(new Animal("Jacaré", "Carnívoro", "Réptil",189.9));
            animais.add(new Animal("Águia", "Carnívoro", "Ave", 9.89));
            animais.add(new Animal("Tartaruga", "Herbívoro", "Réptil", 134.8));
            animais.add(new Animal("Porco", "Onívoro", "Mamífero", 55.6));
            animais.add(new Animal("Jabuti", "Onívoro", "Réptil", 12.6));

            Double peso = 57.8;

            System.out.printf("Herbívoros que pesam mais que %2f kilos: %s", peso, animalStream.selecionarHerbivoroQuePesaMaisQueX(animais, 57.8));
            System.out.println();
            System.out.println("Mamíferos Carnívoros"+animalStream.selecionarMamiferosCarnivoros(animais));
            System.out.println("Animals não repitilianos onívoros"+ animalStream.selecionarNaoRepitilianosOnivoros(animais));
        }
    }
