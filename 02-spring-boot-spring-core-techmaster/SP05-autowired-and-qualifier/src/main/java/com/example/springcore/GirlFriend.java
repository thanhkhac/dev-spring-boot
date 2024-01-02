package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    public Outfit outfit;

    public GirlFriend() {
    }

    /*
    * @Qualifier notations
    * Syntax: @Qualifier("<Specify bean id>")
    * Pay attention:
    *   1. bean id must be class name and first character are lowercase
    *   2. When both @Qualifier and @Primary are found, @Primary will be ignored
    * */
    @Autowired
    public GirlFriend(@Qualifier("kimono") Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}

