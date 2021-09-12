package com.lfernando488.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lfernando488.dsvendas.dto.SaleDTO;
import com.lfernando488.dsvendas.dto.SaleSuccessDTO;
import com.lfernando488.dsvendas.dto.SaleSumDTO;
import com.lfernando488.dsvendas.entities.Sale;
import com.lfernando488.dsvendas.repositories.SaleRepository;
import com.lfernando488.dsvendas.repositories.SellerRepository;


@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepo;

	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true) //não faz lock no banco pois trata-se de uma operação somente leitura
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepo.findAll();
		Page<Sale> result = saleRepo.findAll(pageable);
		return result.map(item -> new SaleDTO(item));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepo.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return saleRepo.successGroupedBySeller();
	}
	
}
