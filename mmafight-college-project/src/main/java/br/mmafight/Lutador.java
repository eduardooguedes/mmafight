package br.mmafight;

import org.springframework.stereotype.Component;

@Component
public class Lutador {
    
    private String nome;
    private String apelido;
    private Double altura;
    private Double peso;

    private Cartel cartel = new Cartel(this);

    public Lutador(String nome, String apelido, Double altura, Double peso){
        this.nome = nome;
        this.apelido = apelido;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public String getApelido(){
        return this.apelido;
    }

    public Double getAltura(){
        return this.altura;
    }

    public Double getPeso(){
        return this.peso;
    }

    public Cartel getCartel(){
        return this.cartel;
    }

}
