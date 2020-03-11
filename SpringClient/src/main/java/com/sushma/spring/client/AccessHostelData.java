package com.sushma.spring.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class AccessHostelData {
	public static void main(String[] args) {

		RestTemplate restClient = new RestTemplate();
		ResponseEntity<String> resEntityString = restClient.getForEntity("http://localhost:9090/getmanager",
				String.class);
		System.out.println(resEntityString.getBody());

		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		restClient.setMessageConverters(messageConverters);

		   
		   ResponseEntity<HostelInfo[]> hostelDetails = restClient.postForEntity("http://localhost:9090/hostels", null,
				HostelInfo[].class);
		   
		   HostelInfo[] hosteldata=hostelDetails.getBody();
		   List<HostelInfo> hlist=Arrays.asList(hosteldata);
		   for (HostelInfo hostelInfo : hlist) {
			System.out.println(hostelInfo);
		}
		System.out.println(hostelDetails);
	}

}
