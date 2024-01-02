package com.example.springcore;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Trouser implements Outfit {

    public Trouser() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public void wear() {
        System.out.println("Đã mặc quần");
    }
}
