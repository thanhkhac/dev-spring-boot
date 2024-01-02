package com.thanhkhac.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//Trong java thường, khi chạy cả một project, chúng ta sẽ định nghĩa một hàm main() đề nó
//Khởi chạy đầu tiên và điều này không có gì thay đổi
@SpringBootApplication
public class MycoolappApplication {
	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(MycoolappApplication.class, args);
	}

}
