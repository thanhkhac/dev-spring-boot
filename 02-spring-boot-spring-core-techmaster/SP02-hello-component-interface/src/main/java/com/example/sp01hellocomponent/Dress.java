package com.example.sp01hellocomponent;

import org.springframework.stereotype.Component;

//Nếu class Dress không được đánh dấu @Component, ApplicationContext sẽ không thể tạo ra đối tượng Dress
@Component
public class Dress implements Outfit{
    public void wear(){
        System.out.println("Đang mặc váy");
    }
}
