package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication


public class Sp01HelloComponentApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Sp01HelloComponentApplication.class, args);

        //Lấy ra một object GirlFriend từ trong context của Container
        GirlFriend girlFriend = context.getBean(GirlFriend.class);
        System.out.println(girlFriend);
        System.out.println(girlFriend.outfit);
        girlFriend.outfit.wear();
    }

}
