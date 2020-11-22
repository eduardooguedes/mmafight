package br.mmafight.Lutador;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lutador {

    @Id
    private String id;
    private String nome;
    private String apelido;
    private Double altura;
    private Double peso;

    private Cartel cartel = new Cartel(this);

    public Lutador(String nome, String apelido, Double altura, Double peso) {
        super();
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.apelido = apelido;
        this.altura = altura;
        this.peso = peso;
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
