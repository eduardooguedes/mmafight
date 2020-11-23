package br.mmafight;

import javax.persistence.Entity;

@Entity
public class Vitória extends InfoResultadoLuta {

    public Vitória() {
    }

    public Vitória(String resultado) {
        super(resultado);
    }

    @Override
    public String getResultado() {
        return super.getResultado();
    }

}
