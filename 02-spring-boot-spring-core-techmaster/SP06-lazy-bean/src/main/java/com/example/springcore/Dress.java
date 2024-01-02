package com.example.springcore;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Dress implements Outfit{
    public Dress() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    public void wear(){
        System.out.println("Đang mặc váy");
    }
}
