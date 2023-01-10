/*
 * Author Name:
 * Date: 12/27/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.example.Pizza.controller;

import com.example.Pizza.exception.UserAlreadyExistsException;
import com.example.Pizza.exception.UserNotFoundException;
import com.example.Pizza.model.Pizza;
import com.example.Pizza.model.User;
import com.example.Pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping(value = "/")
    public ResponseEntity<?> addFun(@RequestBody User user) throws UserAlreadyExistsException {
        ResponseEntity responseEntity=null;
        try{
            user.setPizzaList(new ArrayList<>());
            responseEntity=new ResponseEntity<>(pizzaService.addUser(user), HttpStatus.CREATED);
        }catch (UserAlreadyExistsException e){
            throw new UserAlreadyExistsException();
        }catch (Exception e){
            responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
    @PostMapping (value = "/pizza/{username}")
    public ResponseEntity<?> addpizzaForUser(@PathVariable String username, @RequestBody Pizza pizza){
        ResponseEntity<?> responseEntity =  null;
        try{
            responseEntity = new ResponseEntity<>(pizzaService.saveUserPizzaList(username,pizza),HttpStatus.OK);
            System.out.println("helloo contolr");

            System.out.println(responseEntity);
        } catch (UserNotFoundException e) {
            responseEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

}


