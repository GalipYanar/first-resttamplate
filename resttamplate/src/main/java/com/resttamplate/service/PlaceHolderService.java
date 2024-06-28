package com.resttamplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service

public class PlaceHolderService {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    public void getData(Long id){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String response = restTemplate().exchange("https://jsonplaceholder.typicode.com/comments/" + id,
                HttpMethod.GET, entity, String.class).getBody();

        System.out.println(response);
    }
}
