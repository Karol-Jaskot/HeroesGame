package pl.jaskot.heroesgame.domain.repository;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import pl.jaskot.heroesgame.domain.Quest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepo {

    final static Random rand = new Random();

    List<Quest> quests = new ArrayList<>();

    public void createQuest(String desc){
        quests.add(new Quest(desc));
    }

    public void deleteQuest(Quest quest){
        quests.remove(quest);
    }

    public List<Quest> getAllQuests(){
        return quests;
    }

    @Override
    public String toString(){
        return "QuestRepo{"+
                "questList="+quests+"}";
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest(){
        List<String> descList = new ArrayList<>();

        descList.add("Spal wioske");
        descList.add("Zetnij drzewo");
        descList.add("Ograb orki");
        descList.add("Wywal drzwi");

        String desc = descList.get(rand.nextInt(descList.size()));
        System.out.println("Utworzono zadanie: "+desc);
        createQuest(desc);
    }

}
