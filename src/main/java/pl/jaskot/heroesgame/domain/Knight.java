package pl.jaskot.heroesgame.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Knight {
    private String name;
    private int age;

    private Quest quest;

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
