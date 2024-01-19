package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages="board.spring.mybatis")
@ComponentScan(basePackages="upload")
@ComponentScan(basePackages="config")
@ComponentScan(basePackages = "websocket")
//@ComponentScan(basePackages = "db_jasypt")
//동일 패지키 자동 component-scan
//다른 패키지 설정 추가
//<context:component-scan base-package="board.spring.mybatis" />

@MapperScan(basePackages="board.spring.mybatis")

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("===부트 시작===");
	}

	//생성된 bean 조회하는 로직 추가. 클래스 선언부 implements ... 추가!!!
	@Autowired 
	ApplicationContext factory;
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("===bean 출력 시작===");
		
		//for(String bean : factory.getBeanDefinitionNames()) {
		//	System.out.println(bean);
		//}
		System.out.println("===bean 출력 종료===");
		
	}
	
	
}

