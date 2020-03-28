package com.company;

public class Person implements Chattable {
    String name;

    Person(String name) {
        this.name = name;
    }//end constructor

    @Override
    public String chat() {
        return "Hi, I am a Person";
    }//end chat
}//end class
