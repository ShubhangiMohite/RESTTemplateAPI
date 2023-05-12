package com.example.restapic2.controller;

import com.example.restapic2.entity.C2;
import com.example.restapic2.service.C2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("c2-app")
public class C2Controller
{
    @Autowired
    C2Service c2Service;

    @PostMapping("/create") // localhost:8081/c2-app/create
    public C2 createAddress(@RequestBody C2 c2)
    {
        return c2Service.createAddress(c2);
    }

    @GetMapping("/getById/{id}") // localhost:8081/c2-app/getById/1
    public C2 getById(@PathVariable Integer id)
    {
        return c2Service.getById(id);
    }
}
