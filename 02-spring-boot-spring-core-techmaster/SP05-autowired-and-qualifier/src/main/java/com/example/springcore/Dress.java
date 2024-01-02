package com.example.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dress implements Outfit{
    public void wear(){
        System.out.println("Đang mặc váy");
    }
}
