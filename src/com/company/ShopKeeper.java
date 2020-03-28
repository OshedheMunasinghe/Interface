package com.company;

public class ShopKeeper extends Person {
    ShopKeeper(String name) {
        super(name);
    }

    @Override
    String chat() {
        return "Hi, I am a ShopKeeper";
    }//end chat

    void sellGoods(){
        //TODO: Implement the sellGoods method
    }//end sellGoods
}
