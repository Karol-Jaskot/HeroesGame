package pl.jaskot.heroesgame.domain.repository;

import org.springframework.stereotype.Repository;
import pl.jaskot.heroesgame.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

public class KnightDbRepo implements KnightRepo{

    @Override
    @PostConstruct
    public void build() {
        System.out.println("Leci z bazy danych");
    }

    @Override
    public void createKnight(String name, int age) {
        System.out.println("Leci z bazy danych");
    }

    @Override
    public Collection<Knight> getAllKnights() {
        System.out.println("Leci z bazy danych");
        return null;
    }

    @Override
    public Knight getKnight(String name) {
        System.out.println("Leci z bazy danych");
        return null;
    }

    @Override
    public void deleteKnight(String name) {
        System.out.println("Leci z bazy danych");
    }
}
