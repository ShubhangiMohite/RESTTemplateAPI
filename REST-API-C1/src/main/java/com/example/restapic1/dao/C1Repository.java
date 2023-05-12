package com.example.restapic1.dao;

import com.example.restapic1.entity.C1;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface C1Repository extends MongoRepository<C1,Integer>
{

}
