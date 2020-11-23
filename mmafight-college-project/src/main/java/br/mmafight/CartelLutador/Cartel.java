package br.mmafight.CartelLutador;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.mmafight.Derrota;
import br.mmafight.Vitória;
import br.mmafight.Lutador.Lutador;

@Entity
public class Cartel {

    @Id
    private String id;

    @OneToOne(cascade = CascadeType.ALL)
    private Lutador lutador;

    private int empates;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Vitória> vitórias = new ArrayList<Vitória>();

    @OneToMany(fetch = FetchType.EAGER)
    private List<Derrota> derrotas = new ArrayList<Derrota>();

    public Cartel(Lutador lutador) {
        this.lutador = lutador;
        this.id = lutador.getId();
    }

    public Lutador getLutador() {
        return this.lutador;
    }

    public String getId() {
        return this.id;
    }

    public List<Vitória> getVitórias() {
        return this.vitórias;
    }

    public void addVitória(String resultado) {
        Vitória nova = new Vitória(resultado);
        vitórias.add(nova);
    }

    public List<Derrota> getDerrotas() {
        return this.derrotas;
    }

    public void addDerrota(String resultado) {
        Derrota nova = new Derrota(resultado);
        derrotas.add(nova);
    }

    public int getEmpates() {
        return this.empates;
    }

    public void addEmpate() {
        empates++;
    }
}
