package pl.jaskot.heroesgame.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Quest {

    private String description;

    @Override
    public String toString(){
        return description;
    }

}
