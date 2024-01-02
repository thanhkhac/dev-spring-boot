package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

        GirlFriend girlFriend = context.getBean(GirlFriend.class);
        System.out.println(girlFriend);
        System.out.println(girlFriend.outfit);
        girlFriend.outfit.wear();
    }

}
