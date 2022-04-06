package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);
		System.out.print(new Solution().fourSum(new int[] {2,2,2,2}, 8 ));
	}

}