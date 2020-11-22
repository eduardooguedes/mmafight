package br.mmafight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMmaFight implements CommandLineRunner{
    
    @Autowired
    private Lutador werdum= new Lutador("werdum", "Vai Cavalo", 109.77, 193.04);
    
    public static void main(String[] args) {
        
        SpringApplication.run(AppMmaFight.class, args).close();
        
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(werdum.getNome());

    }
}   