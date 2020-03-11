package com.sushma.springnode.client;

import org.springframework.web.client.RestTemplate;

public class AccessNodejsData {

	public static void main(String[] args) {
	RestTemplate template=new RestTemplate();
	String data=template.getForEntity("https://nodejs.org/en/about/",String.class).getBody();
	System.out.println(data);
	}
}
