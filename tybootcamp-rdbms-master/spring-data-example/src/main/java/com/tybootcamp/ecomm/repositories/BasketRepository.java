package com.tybootcamp.ecomm.repositories;

import com.tybootcamp.ecomm.entities.Basket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket,Long> {

}
