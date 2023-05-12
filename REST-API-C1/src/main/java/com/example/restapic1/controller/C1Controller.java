package com.example.restapic1.controller;

import com.example.restapic1.entity.C1;
import com.example.restapic1.service.C1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("c1-app")
public class C1Controller
{
    @Autowired
    C1Service c1Service;
    @PostMapping("/create")
    public C1 createStudent(@RequestBody C1 c1)
    {
        return c1Service.createStudent(c1);
    }
    @GetMapping("/getById/{id}") //   localhost:8080/c1-app/getById/1
    public C1 getById(@PathVariable Integer id)
    {
        return c1Service.getById(id);
    }

}
