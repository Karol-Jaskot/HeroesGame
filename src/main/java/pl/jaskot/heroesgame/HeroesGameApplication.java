package pl.jaskot.heroesgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HeroesGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroesGameApplication.class, args);
    }

}
