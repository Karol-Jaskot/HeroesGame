package pl.jaskot.heroesgame.domain.repository;

import org.springframework.stereotype.Repository;
import pl.jaskot.heroesgame.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

@Repository
public interface KnightRepo {

    void build();

    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);

    void saveKnight(Knight knight);
}
