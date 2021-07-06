package com.tybootcamp.ecomm.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer", orphanRemoval = true)
    private Profile profile;

    @OneToOne
    private Basket basket;
    @NotNull
    private String name;

    public Customer(){

    }

    public Customer(Long id){
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Basket getBasket(){
        return basket;

    }
    @Override
    public String toString(){
        if (profile == null){
            return super.toString();
        }
        else{
            return getProfile().getFirstName() + " " + getProfile().getLastName();
        }
    }
}

