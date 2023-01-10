/*
 * Author Name:
 * Date: 12/27/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.example.Pizza.model;

import org.springframework.data.annotation.Id;



public class Pizza {
    @Id
    private int pizzaId;
    private String pizzaName;

    private String pizzaSize;
    private String quantity;
    private int pizzaPrice;



    public Pizza() {
    }

    public Pizza(int pizzaId, String pizzaName, String pizzaSize, String quantity, int pizzaPrice) {
        this.pizzaId = pizzaId;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.quantity = quantity;
        this.pizzaPrice = pizzaPrice;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public Pizza setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
        return this;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public Pizza setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
        return this;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public Pizza setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
        return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public Pizza setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public Pizza setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
        return this;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaId=" + pizzaId +
                ", pizzaName='" + pizzaName + '\'' +
                ", pizzaSize='" + pizzaSize + '\'' +
                ", quantity='" + quantity + '\'' +
                ", pizzaPrice=" + pizzaPrice +
                '}';
    }
}
