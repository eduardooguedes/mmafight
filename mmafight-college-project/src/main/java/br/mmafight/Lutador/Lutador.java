package br.mmafight.Lutador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.mmafight.BaseEntity;
import br.mmafight.Patrocinador;
import br.mmafight.CartelLutador.Cartel;

@Entity
public class Lutador extends BaseEntity {

    @Id
    private String id;
    private String nome;
    private String apelido;
    private Double altura;
    private Double peso;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cartel cartel = new Cartel(this);

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();

    public Lutador() {
    }

    public Lutador(String nome, String apelido, Double altura, Double peso) {
        super();
        this.nome = nome;
        this.apelido = apelido;
        this.altura = altura;
        this.peso = peso;
    }

    public void addPatrocinador(Patrocinador patrocinador) {
        patrocinadores.add(patrocinador);
    }

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getApelido() {
        return this.apelido;
    }

    public Double getAltura() {
        return this.altura;
    }

    public Double getPeso() {
        return this.peso;
    }

    public Cartel getCartel() {
        return this.cartel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Lutador)) {
            return false;
        }

        Lutador lutador = (Lutador) o;
        return Objects.equals(id, lutador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
