package com.example.demo.service;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Builder
@Service
@Data

public class RestTemplateService {
    private static RestTemplate restTemplate;

    public static String getNum(int num) {
    String output = restTemplate.exchange("http://localhost:8081/api/v1/evenOdd/returnAnswer/" + num,
            HttpMethod.GET,
            null,
            String.class).getBody();
        return output;
    }
}



