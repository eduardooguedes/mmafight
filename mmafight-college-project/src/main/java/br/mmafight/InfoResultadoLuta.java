package br.mmafight;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class InfoResultadoLuta {

    private String resultado;

    public InfoResultadoLuta() {
    }

    public InfoResultadoLuta(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }
}
