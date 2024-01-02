package com.example.sp01hellocomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//Đây sẽ là nơi khởi chạy chương trình đầu tiên
/*
* Khi lệnh SpringApplication.run được chạy, chương trình sẽ tạo ra một container là ApplicationContext
* Container này có tác dụng quản lý một không gian lưu trữ được gọi là context
* Container này sẽ tìm kiếm toàn bộ các Bean có trong chương trình.
* Bean là các đối tượng java được quản lý bởi Container
* */
@SpringBootApplication
public class Sp01HelloComponentApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Sp01HelloComponentApplication.class, args);

        Outfit outfit = context.getBean(Outfit.class);
        Outfit outfit2 = new Dress();
        System.out.println("Instance: " + outfit);
        System.out.println("Instance2: " + outfit2);
        //Các đối tượng implement Interface, khi được tạo ra, instance sẽ là class implement, không phải Interface
        outfit.wear();

    }

}
