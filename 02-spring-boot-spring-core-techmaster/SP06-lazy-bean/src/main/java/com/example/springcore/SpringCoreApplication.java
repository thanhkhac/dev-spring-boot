package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/* 1. BEAN LAZY VỚI ANNOTATION
* Đối với các class được đánh dấu Component, khi khởi chạy, chương trình sẽ khởi tạo các bean trong chương trình qua
* constructor (Ưu tiên chạy constructor có sử dụng @AutoWired, nếu không có, sẽ khởi chạy constructor rỗng)
* VD: Tại constructor tại các class đều có lệnh print in ra tên class đó khi khởi chạy.
*   Output:
        In constructor: Dress
        In constructor: Kimono
        In Constructor: GirlFriend
        In constructor: Trouser
*   @Lazy là Annotation để bean sẽ chỉ được tạo ra khi cần
*   Sau khi sử dụng @Lazy cho toàn bộ class: Dress, Kimono, Trouser, GirlFriend
*   Output:
        In constructor: Kimono
        In Constructor: GirlFriend
*   Ở đây bean chỉ được tạo ra khi cần do GirlFriend được khởi tạo và thuộc tính Outfit của girlfriend được @AutoWired
* */

/* 2. BEAN LAZY CHO TOÀN BỘ CLASS (Được cấu hình bên trong file application.properties) */


@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

        GirlFriend girlFriend = context.getBean(GirlFriend.class);
    }

}
