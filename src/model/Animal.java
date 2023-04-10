package model;

import java.util.Objects;

public class Animal {
    private String nome;
    private String alimentacao;
    private String classe;
    private double peso;

    public Animal(String nome, String alimentacao, String classe, double peso) {
        this.nome = nome;
        this.alimentacao = alimentacao;
        this.classe = classe;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.peso, peso) == 0 && Objects.equals(nome, animal.nome) && Objects.equals(alimentacao, animal.alimentacao) && Objects.equals(classe, animal.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alimentacao, classe, peso);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", classe='" + classe + '\'' +
                ", peso=" + peso +
                '}';
    }
}
