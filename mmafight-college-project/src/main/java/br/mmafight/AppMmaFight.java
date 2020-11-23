package br.mmafight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.mmafight.Lutador.Lutador;
import br.mmafight.Lutador.LutadorService;

@SpringBootApplication
public class AppMmaFight implements CommandLineRunner {

    @Autowired
    private LutadorService lutadorService;

    private Lutador werdum = new Lutador("werdum", "Vai Cavalo", 109.77, 193.04);

    public static void main(String[] args) {

        SpringApplication.run(AppMmaFight.class, args).close();

    }

    @Override
    public void run(String... args) throws Exception {
        lutadorService.saveLutador(werdum);
        for (Lutador lt : lutadorService.obterLutadores()) {
            System.out.println(lt.getNome() + " - altura > " + lt.getAltura() + " - peso > " + lt.getPeso());
        }
    }
}