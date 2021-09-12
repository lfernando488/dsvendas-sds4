package com.lfernando488.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lfernando488.dsvendas.dto.SellerDTO;
import com.lfernando488.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

	@Autowired
	private SellerService sellerSerice;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = sellerSerice.findAll();
		return ResponseEntity.ok(list);
	}
	
}
