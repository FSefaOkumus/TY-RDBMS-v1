package com.tybootcamp.ecomm.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Basket {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name ="customer_id")
    private Customer customer;

    @OneToMany
    @JoinColumn(name ="product_id")
    private Product product;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Product> Basket() {
        return cartItems;
    }

    List<Product> cartItems= new ArrayList<Product>();


    public void addItemtoCart(Product product){  //Products
        cartItems.add(product);
    }

    public void removeItemfromCart(Product product){
        cartItems.remove(product);
    }

    public void printCart(){
        for (Product items : cartItems){
            System.out.println(items.getName());
        }
    }
    public void clearBasket(){
        for (Product items : cartItems){
            cartItems.remove(items);
        }
    }

    public double totalPriceBasket(){
        float totalPrice = 0;
        for (Product items : cartItems){
            totalPrice+=(items.getPrice());
        }
        return totalPrice;

    }


}
