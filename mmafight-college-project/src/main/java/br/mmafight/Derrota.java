package br.mmafight;

import javax.persistence.Entity;

@Entity
public class Derrota extends InfoResultadoLuta {

    public Derrota() {
    }

    public Derrota(String resultado) {
        super(resultado);
    }

    @Override
    public String getResultado() {
        return super.getResultado();
    }
}
