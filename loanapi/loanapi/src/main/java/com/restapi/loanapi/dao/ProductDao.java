package com.restapi.loanapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.loanapi.entities.LoanProducts;

public interface ProductDao extends JpaRepository<LoanProducts,Integer> {
	

}
