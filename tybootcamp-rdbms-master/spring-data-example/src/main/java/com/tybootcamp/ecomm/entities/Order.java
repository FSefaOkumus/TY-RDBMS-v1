package com.tybootcamp.ecomm.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Date date;

    @OneToOne
    @JoinColumn(name ="basket_id")
    private Basket basket;

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @OneToOne
    @JoinColumn(name ="customer_id")
    private Customer customer;

    List<Basket> orders= new ArrayList<Basket>();

    public Order(){

    }

    public Order(Customer customer){
        Basket basket= customer.getBasket();
        orders.add(basket);
//        basket.clearBasket();
    }

}
