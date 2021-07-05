package com.tybootcamp.ecomm.repositories;

import com.tybootcamp.ecomm.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Customer,Long> {

}
