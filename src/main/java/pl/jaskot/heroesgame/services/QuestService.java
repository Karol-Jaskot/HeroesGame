package pl.jaskot.heroesgame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.jaskot.heroesgame.domain.Quest;
import pl.jaskot.heroesgame.domain.repository.KnightMemoryRepo;
import pl.jaskot.heroesgame.domain.repository.KnightRepo;
import pl.jaskot.heroesgame.domain.repository.QuestRepo;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepo knightRepo;

    @Autowired
    QuestRepo questRepo;

    final static Random rand = new Random();

    public void assignRandomQuest(String name){
        List<Quest> quests = questRepo.getAllQuests();
        Quest randomQuest = quests.get(rand.nextInt(quests.size()));
        knightRepo.getKnight(name).setQuest(randomQuest);
        questRepo.deleteQuest(randomQuest);
    }

}
