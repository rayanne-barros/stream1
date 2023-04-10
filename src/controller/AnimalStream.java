package controller;

import model.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalStream {
    public List<Animal> selecionarHerbivoroQuePesaMaisQueX(List<Animal> animais, Double peso){
        // Seleciona Herbíboros que pesam mais que "peso" especificado
        return animais.stream()
                .filter(a -> a.getAlimentacao().equals("Herbívoro")
                        && a.getPeso() > peso
                ).collect(Collectors.toList());
    }

    public List<Animal> selecionarNaoRepitilianosOnivoros(List<Animal> animals){
        return animals.stream()
                .filter(a -> !a.getClasse().equals("Réptil") && a.getAlimentacao().equals("Onívoro"))
                .collect(Collectors.toList());
    }
    public List<Animal> selecionarMamiferosCarnivoros(List<Animal> animals){
        return animals.stream()
                .filter(a -> a.getClasse().equals("Mamífero") && a.getAlimentacao().equals("Carnívoro"))
                .collect(Collectors.toList());
    }
}
