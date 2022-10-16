package com.example.restTemplatespringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.example.restTemplatespringboot.entity.MayBay;

@SpringBootApplication
public class RestTemplateSpringbootApplication {
	static final String URL_CHUYENBAY = "http://localhost:8081/chuyenbay/gaDenDaLat";
	static final String URL_THEMMAYBAY = "http://localhost:8081/maybay/themMayBay";
	static final String URL_XOAMAYBAY = "http://localhost:8081/maybay/xoaMayBay/";

	public static void main(String[] args) {
		
		// get
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL_CHUYENBAY, String.class);
		System.out.println(result);

		// post
		MayBay mayBay = new MayBay("1111", "BBB", 10000);

		System.out.println(mayBay);
		restTemplate.postForEntity(URL_THEMMAYBAY, mayBay, String.class);

		// delete
		String maMB = "11";
		restTemplate.delete(URL_XOAMAYBAY + maMB);

	}

}
