package com.tybootcamp.ecomm.entities;


import javax.persistence.*;

@Entity
public class Basket {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name ="customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "shoppingcart_id")
    private ShoppingCart cart;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seller", orphanRemoval = true)

//    private Map<Ineger>
}
