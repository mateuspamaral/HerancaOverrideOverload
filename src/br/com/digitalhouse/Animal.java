package br.com.digitalhouse;

public abstract class Animal {

    //Attributes
    private String tamanho;
    private String raca;

    //Constructors
    public Animal() {
    }

    public Animal(String tamanho, String raca) {
        this.tamanho = tamanho;
        this.raca = raca;
    }

    //Getters & Setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    //Class methods
    public abstract Boolean ehMamifero();
}
