package pl.jaskot.heroesgame.domain.repository;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.jaskot.heroesgame.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class KnightMemoryRepo implements KnightRepo {

    Map<String, Knight> knights = new HashMap();

    @Override
    @PostConstruct
    public void build(){
        createKnight("Lancelot",29);
        createKnight("Percival",25);
    }

    @Override
    public void createKnight(String name, int age){
        knights.put(name, new Knight(name, age));
    }

    @Override
    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    @Override
    public Knight getKnight(String name){
        return knights.get(name);
    }

    @Override
    public void deleteKnight(String name){
        knights.remove(name);
    }

}
