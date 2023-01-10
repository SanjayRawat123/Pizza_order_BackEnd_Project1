/*
 * Author Name:
 * Date: 12/27/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.example.Pizza.repository;

import com.example.Pizza.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends MongoRepository<User ,String> {

    User findByusername(String username);

}
