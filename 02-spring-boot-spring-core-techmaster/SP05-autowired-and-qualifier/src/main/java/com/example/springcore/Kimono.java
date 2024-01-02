package com.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class Kimono implements Outfit{

    @Override
    public void wear() {
        System.out.println("Đã mặc Kimono");
    }
}
