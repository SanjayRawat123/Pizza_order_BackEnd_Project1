/*
 * Author Name:
 * Date: 12/27/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.example.Pizza.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {

   @Id
   private String username;
   private List<Pizza> pizzaList;

   public User() {
   }

   public User(String username, List<Pizza> pizzaList) {
      this.username = username;
      this.pizzaList = pizzaList;
   }

   public String getUsername() {
      return username;
   }

   public User setUsername(String username) {
      this.username = username;
      return this;
   }

   public List<Pizza> getPizzaList() {
      return pizzaList;
   }

   public User setPizzaList(List<Pizza> pizzaList) {
      this.pizzaList = pizzaList;
      return this;
   }

   @Override
   public String toString() {
      return "User{" +
              "username='" + username + '\'' +
              ", pizzaList=" + pizzaList +
              '}';
   }
}
