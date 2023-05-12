package com.example.restapic1.service;

import com.example.restapic1.dao.C1Repository;
import com.example.restapic1.entity.C1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class C1Service
{
    @Autowired
    C1Repository c1Repository;
    public C1 createStudent(C1 c1)
    {
        return c1Repository.save(c1);
    }
    public C1 getById(Integer id)
    {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8081/c2-app/getById/1";
        ResponseEntity<Object> response
                = restTemplate.getForEntity(fooResourceUrl , Object.class);
        //Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
        System.out.println(response.getBody());
        return c1Repository.findById(id).get();
    }
}
