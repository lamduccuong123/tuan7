package com.example.tuan4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.tuan4.entity.ChuyenBay;
import com.example.tuan4.repository.ChuyenBayRepository;
import com.example.tuan4.repository.MayBayRepository;

@SpringBootApplication
public class Tuan4Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Tuan4Application.class, args);
	}

}
