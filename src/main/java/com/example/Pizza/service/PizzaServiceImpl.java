/*
 * Author Name:
 * Date: 12/27/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.example.Pizza.service;

import com.example.Pizza.exception.UserAlreadyExistsException;
import com.example.Pizza.exception.UserNotFoundException;
import com.example.Pizza.model.Pizza;
import com.example.Pizza.model.User;
import com.example.Pizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;


    @Override
    public User addUser(User user) throws UserAlreadyExistsException {
        if(pizzaRepository.findById(user.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
            User savedUser = pizzaRepository.save(user);

        return savedUser;

    }

    @Override
    public User saveUserPizzaList( String username,Pizza pizza) throws UserNotFoundException {

        if (pizzaRepository.findById(username).isEmpty())
        {
            throw new UserNotFoundException();
        }
        User user= pizzaRepository.findByusername(username);
        if (user.getPizzaList()==null)
        {
           // System.out.println("null pizzas value");
            user.setPizzaList(Arrays.asList(pizza));
        }
        else
        {
            List<Pizza> pizzas = user.getPizzaList();

            pizzas.add(pizza);

            user.setPizzaList(pizzas);

        }
        return pizzaRepository.save(user);
    }






}
