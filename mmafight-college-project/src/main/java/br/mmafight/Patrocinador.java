package br.mmafight;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.mmafight.Lutador.Lutador;

@Entity
public class Patrocinador extends BaseEntity {

    @Id
    private String id;
    private String nome;
    private Double investimento;

    @ManyToMany
    private List<Lutador> lutadores = new ArrayList<Lutador>();

    public Patrocinador() {
        super();
    }

    public Patrocinador(String nome, Double investimento) {
        this();
        this.nome = nome;
        this.investimento = investimento;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getInvestimento() {
        return this.investimento;
    }

    public List<Lutador> getLutadoresPatrocinados() {
        return this.lutadores;
    }

}