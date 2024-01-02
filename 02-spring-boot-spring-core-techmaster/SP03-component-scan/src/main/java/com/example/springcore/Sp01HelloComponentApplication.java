package com.example.springcore;

import com.example.springcore.other_package.Kimono;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


//Đây sẽ là nơi khởi chạy chương trình đầu tiên
/*
* Khi lệnh SpringApplication.run được chạy, chương trình sẽ tạo ra một container là ApplicationContext
* Container này có tác dụng quản lý một không gian lưu trữ được gọi là context
* Container này sẽ tìm kiếm toàn bộ các Bean có trong chương trình.
* Bean là các đối tượng java được quản lý bởi Container
* */

//@ComponentScan("com.example.springcore.other_package")
//@ComponentScan({"com.example.springcore.other_package","abcxyz"})
//@SpringBootApplication(scanBasePackages = "com.example.springcore.other_package", "abcxyz");
@SpringBootApplication(scanBasePackages = "com.example.springcore.other_package")
//Ở component scan này, sẽ chỉ tìm các bean ở trong package được chỉ định, do vậy, chương trình sẽ báo lỗi ở Dress.Class do class này
//không ở trong phạm vi dò tìm
public class Sp01HelloComponentApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Sp01HelloComponentApplication.class, args);
        //Mặc định thì container của Spring boot sẽ đi tìm tất cả các bean mà
        //nằm bên trong package mà chứa class main và các package con.
        Kimono kimono = context.getBean(Kimono.class);
        System.out.println("Instance of Kimono: " + kimono);

        Dress dress = context.getBean(Dress.class);
        System.out.println("Instance of Dress: " + dress);

    }

}
