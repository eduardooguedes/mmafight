// package br.mmafight.CartelLutador;

// // import java.util.List;
// import java.util.Optional;

// import javax.transaction.Transactional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// @Transactional
// public class CartelService {

// @Autowired
// private CartelRepository repositório;
// private String lutadorCartel;

// public void saveCartel(Cartel cartel) {
// this.lutadorCartel = cartel.getLutador().getId();
// repositório.save(cartel);
// }

// public Optional<Cartel> obterCartelLutador() {
// return repositório.findById(lutadorCartel);
// }
// }
