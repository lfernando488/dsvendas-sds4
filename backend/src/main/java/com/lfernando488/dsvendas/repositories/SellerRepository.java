package com.lfernando488.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfernando488.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>  {

}
