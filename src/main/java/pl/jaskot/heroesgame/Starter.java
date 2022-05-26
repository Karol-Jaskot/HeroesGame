package pl.jaskot.heroesgame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.jaskot.heroesgame.domain.repository.KnightMemoryRepo;
import pl.jaskot.heroesgame.domain.repository.KnightRepo;
import pl.jaskot.heroesgame.domain.repository.QuestRepo;
import pl.jaskot.heroesgame.services.QuestService;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepo knightRepo;

    @Autowired
    QuestRepo questRepo;

    @Autowired
    QuestService questService;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(knightRepo.getAllKnights());
        System.out.println(questRepo.getAllQuests());

        questRepo.createRandomQuest();
        questRepo.createRandomQuest();

        questService.assignRandomQuest("Lancelot");
        questService.assignRandomQuest("Percival");
        System.out.println(knightRepo.getAllKnights());
    }
}
