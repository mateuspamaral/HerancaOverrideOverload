package br.com.digitalhouse;

public class Cachorro extends Animal {

    private String nome;

    //Constructors
    public Cachorro(String nome, String tamanho, String raca) {
        super(tamanho, raca);
        this.nome = nome;
    }

    @Override
    public Boolean ehMamifero() {
        return true;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
