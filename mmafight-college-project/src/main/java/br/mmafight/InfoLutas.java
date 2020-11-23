package br.mmafight;

public class InfoLutas {

    private int nocautes;
    private int finalizações;
    private int decisõesJuiz;

    public void addNocaute() {
        nocautes++;
    }

    public int getNocautes() {
        return this.nocautes;
    }

    public void addFinalização() {
        finalizações++;
    }

    public int getFinalizações() {
        return this.finalizações;
    }

    public void addDecisãoJuiz() {
        decisõesJuiz++;
    }

    public int getDecisõesJuiz() {
        return decisõesJuiz;
    }

}
