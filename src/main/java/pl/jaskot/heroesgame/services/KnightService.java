package pl.jaskot.heroesgame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jaskot.heroesgame.domain.Knight;
import pl.jaskot.heroesgame.domain.repository.KnightRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class KnightService {

    @Autowired
    KnightRepo knightRepo;

    public List<Knight> getKnights(){
        return new ArrayList<>(knightRepo.getAllKnights());
    }

    public void saveKnight(Knight knight) {
        knightRepo.saveKnight(knight);
    }

    public void deleteKnight(String name){
        knightRepo.deleteKnight(name);
    }
}
