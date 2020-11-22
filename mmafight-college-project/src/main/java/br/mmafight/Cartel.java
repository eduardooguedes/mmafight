package br.mmafight;

import java.util.ArrayList;
import java.util.List;

public class Cartel {

    private Lutador lutador;
    private int empates;
    private List<Vitória> vitórias = new ArrayList<>();
    private List<Derrota> derrotas = new ArrayList<Derrota>();

    public Cartel(Lutador lutador){
        this.lutador = lutador;
    }

    public Lutador getLutador(){
        return this.lutador;
    }

    public List<Vitória> getVitórias() {
        return this.vitórias;
    }

    public void addVitória(Vitória vitoria){
        vitórias.add(vitoria);
    }

    public List<Derrota> getDerrotas() {
        return this.derrotas;
    }
    
    public void addDerrota(Derrota derrota){
        derrotas.add(derrota);
    }
    
    public int getEmpates(){
        return this.empates;
    }

    public void addEmpate(){
        empates++;
    }




}
