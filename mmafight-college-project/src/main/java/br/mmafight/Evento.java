package br.mmafight;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.mmafight.Lutador.Lutador;

@Entity
public class Evento extends BaseEntity {

    @OneToOne
    private Lutador lutador1;

    @OneToOne
    private Lutador lutador2;

    private Lutador vitorioso;
    private Lutador derrotado;

    public Evento() {
        super();
    }

    public Evento(Lutador lutador1, Lutador lutador2) {
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
    }

    public void setResultado(Lutador vitorioso, Lutador derrotado, String resultado) {
        this.vitorioso = vitorioso;
        vitorioso.getCartel().addVitória(resultado);

        this.derrotado = derrotado;
        derrotado.getCartel().addDerrota(resultado);
    }

    public Lutador getVitorioso() {
        return this.vitorioso;
    }

    public Lutador getDerrotado() {
        return this.derrotado;
    }

}
