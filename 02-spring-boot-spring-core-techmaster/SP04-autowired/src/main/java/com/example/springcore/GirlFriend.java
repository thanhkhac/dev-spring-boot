package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
* Tổng kết:
* @AutoWired là annotation dùng để
* - Tự động liên kết Beans (Như ở dưới)
* - Tự động Inject Dependency
* Có 3 cách sử dụng @AutoWired d
* */


@Component
public class GirlFriend {
    //Có 3 cách để Dependency Injection bằng @AutoWired

    //Cách 1: Field Injection
//    @Autowired
    public Outfit outfit; //Tại đây, outfit được coi là một dependency của GirlFriend

    public GirlFriend() {
    }
    //Cách 2: Constructor Injection
//    @Autowired
    public GirlFriend(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }
    //Cách 3: Setter Injection
    @Autowired
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}

