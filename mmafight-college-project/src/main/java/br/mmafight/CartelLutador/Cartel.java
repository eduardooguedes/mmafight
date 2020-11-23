// package br.mmafight.CartelLutador;

// import java.util.ArrayList;
// import java.util.List;

// import javax.persistence.Entity;
// import javax.persistence.Id;

// import br.mmafight.Derrota;
// import br.mmafight.Vitória;
// import br.mmafight.Lutador.Lutador;

// @Entity
// public class Cartel {

// @Id
// private String id;
// private Lutador lutador;
// private int empates;
// private List<Vitória> vitórias = new ArrayList<>();
// private List<Derrota> derrotas = new ArrayList<Derrota>();

// public Cartel(Lutador lutador) {
// this.lutador = lutador;
// }

// public Lutador getLutador() {
// return this.lutador;
// }

// public List<Vitória> getVitórias() {
// return this.vitórias;
// }

// public void addVitória(Vitória vitoria) {
// vitórias.add(vitoria);
// }

// public List<Derrota> getDerrotas() {
// return this.derrotas;
// }

// public void addDerrota(Derrota derrota) {
// derrotas.add(derrota);
// }

// public int getEmpates() {
// return this.empates;
// }

// public void addEmpate() {
// empates++;
// }

// public String getId() {
// return null;
// }

// }
