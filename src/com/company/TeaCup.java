package com.company;

public class TeaCup extends Person implements Speak {
    TeaCup(String name) {
        super(name);
    }//end constructor

    @Override
    public String chat() {
        return "Hi guys, I am a teacup.. Wired right?...";
    }
}
