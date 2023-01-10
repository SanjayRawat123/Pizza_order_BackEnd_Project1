package com.example.Pizza.service;

import com.example.Pizza.exception.UserAlreadyExistsException;
import com.example.Pizza.exception.UserNotFoundException;
import com.example.Pizza.model.Pizza;
import com.example.Pizza.model.User;

public interface PizzaService {


    User addUser(User user)throws UserAlreadyExistsException;;

    User saveUserPizzaList( String username,Pizza pizza) throws UserNotFoundException;
}
