//package com.tybootcamp.ecomm.entities;
//
//
//import javax.persistence.*;
//import java.util.List;
//
//public class ShoppingCart {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @OneToOne
//    @JoinColumn(name ="customer_id")
//    private Customer customer;
//
//    @OneToMany
//    @JoinColumn(name ="product_id")
//    private Product product;
//
////    public List<Product> CartItems(Customer customer){
////        return CartRepository.findByCustomer(customer);
////    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//}
