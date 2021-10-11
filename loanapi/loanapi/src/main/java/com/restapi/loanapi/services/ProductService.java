package com.restapi.loanapi.services;

import java.util.List;

import com.restapi.loanapi.entities.LoanProducts;

public interface ProductService 
{
	public List<LoanProducts> getProducts();

	public LoanProducts addProduct(LoanProducts product);

	public LoanProducts getProduct(int parseInt);

	public LoanProducts updateCourse(LoanProducts product);

	public void deleteProduct(int parseInt);

}
