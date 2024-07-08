package com.generics.topics.creatingowngenerics;

public class Animal implements Diet, Habitat {
    @Override
    public void diet() {

    }

    @Override
    public void habitat() {

    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
