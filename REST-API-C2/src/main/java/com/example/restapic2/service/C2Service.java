package com.example.restapic2.service;

import com.example.restapic2.dao.C2Repository;
import com.example.restapic2.entity.C2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class C2Service
{
    @Autowired
    C2Repository c2Repository;

    public C2 createAddress(C2 c2)
    {
        return c2Repository.save(c2);
    }

    public C2 getById(Integer id)
    {
        return c2Repository.findById(id).get();
    }
}
