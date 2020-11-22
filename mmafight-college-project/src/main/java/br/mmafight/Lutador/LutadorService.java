package br.mmafight.Lutador;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LutadorService {

    @Autowired
    private LutadorRepository repositório;

    public void saveLutador(Lutador lutador) {
        repositório.save(lutador);
    }

    public List<Lutador> obterLutadores() {
        repositório.findAll();
    }
}
