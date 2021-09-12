package com.lfernando488.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfernando488.dsvendas.dto.SellerDTO;
import com.lfernando488.dsvendas.entities.Seller;
import com.lfernando488.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepo;

	public List<SellerDTO> findAll() {

		List<Seller> result = sellerRepo.findAll();

		return result.stream().map(item -> new SellerDTO(item)).collect(Collectors.toList());
	}

}
