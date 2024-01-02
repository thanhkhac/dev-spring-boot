package com.example.springcore.other_package;

import org.springframework.stereotype.Component;

@Component //Đánh dấu là 1 bean
public class Kimono {
    public void wear(){
        System.out.println("Đã mặc Kimono");
    }
}
