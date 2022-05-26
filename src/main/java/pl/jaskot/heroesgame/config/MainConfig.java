package pl.jaskot.heroesgame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.jaskot.heroesgame.domain.repository.KnightDbRepo;
import pl.jaskot.heroesgame.domain.repository.KnightMemoryRepo;
import pl.jaskot.heroesgame.domain.repository.KnightRepo;

@Configuration
public class MainConfig {

    @Bean(name = "knightMemoryRepo")
    @Profile("dev")
    public KnightRepo createKnightMemoryRepo(){
        KnightRepo knightRepo = new KnightMemoryRepo();
        return knightRepo;
    }

    @Bean(name = "knightDbRepo")
    @Profile("prd")
    public KnightRepo createKnightDbRepo(){
        KnightRepo knightRepo = new KnightDbRepo();
        return knightRepo;
    }
}
