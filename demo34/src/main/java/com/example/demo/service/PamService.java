package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.model.ReturnResult;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

@Service
public class PamService {



    public String getFoodByPerson(Person person) {
        person.setAriyal("hey");

        TypeReference typeReference = new TypeReference<HashMap<Object,Object>>(){};

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/kie-server/services/rest/server/containers/FavouriteFood_1.0.0-SNAPSHOT/processes/FavouriteFood.FindOutFavouriteFood/instances";

        HttpHeaders headers = new HttpHeaders();

        String x  = HttpHeaders.encodeBasicAuth("rhpamAdmin","Codezero88*", Charset.defaultCharset());

        System.out.println(x);

        headers.set("Authorization","Basic " + x);


        HttpEntity<Person> httpEntity = new HttpEntity<>(person,headers);
        String instanceId = restTemplate.postForObject(url,httpEntity,String.class);

        System.out.println(instanceId + "--> this is instanceId");

        String url2 = "http://localhost:8080/kie-server/services/rest/server/containers/FavouriteFood_1.0.0-SNAPSHOT/processes/instances/"+instanceId+"/variables/instances/food";

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<HashMap<Object,Object>> response;
        response = restTemplate.exchange(url2, HttpMethod.GET,requestEntity,new ParameterizedTypeReference<HashMap<Object,Object>>() {});



        System.out.println(response.getBody());

        final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
        final ReturnResult pojo = mapper.convertValue(response.getBody(), ReturnResult.class);

        System.out.println(pojo.getReturnResultIndList().get(0).getValue());

        return pojo.getReturnResultIndList().get(0).getValue();
    }
}
