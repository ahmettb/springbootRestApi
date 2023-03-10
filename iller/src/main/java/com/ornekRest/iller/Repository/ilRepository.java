package com.ornekRest.iller.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ornekRest.iller.Model.il;

import java.util.List;

public interface ilRepository extends MongoRepository<il,String> {

il findByName(String name);

}



