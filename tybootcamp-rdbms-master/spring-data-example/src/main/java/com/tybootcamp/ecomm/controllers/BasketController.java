package com.tybootcamp.ecomm.controllers;


import com.tybootcamp.ecomm.entities.Basket;
import com.tybootcamp.ecomm.entities.Customer;
import com.tybootcamp.ecomm.entities.Order;
import com.tybootcamp.ecomm.repositories.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/basket")
public class BasketController {
    @Autowired
    private BasketRepository _basketRepository;


//    @PostMapping("/")
//    public ResponseEntity<?> basket(@RequestParam(value = "id") long id){
//
//    }


}
