package com.bluenile.project.repositories;

import com.bluenile.project.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

//    saveCart(){
//
//    }
}
