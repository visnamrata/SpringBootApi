package com.restapi.loanapi.controller;
import com.restapi.loanapi.entities.LoanProducts;
import com.restapi.loanapi.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller 
{
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/home")
   public String home()
   {
	   return "Welcome to Loan Api";
   }
	
	//To get all the products
	
	@GetMapping("/loanproducts")
	public List<LoanProducts> getProducts()
	{
		return this.productservice.getProducts();
		
	}
	
	@GetMapping("/loanproducts/{productId}")
	public LoanProducts getProduct(@PathVariable String pId)
	{
		return this.productservice.getProduct(Integer.parseInt(pId));
		
	}
	
	
	
	@PostMapping(path="/loanproducts",consumes="application/json")
	public LoanProducts addProduct(@RequestBody LoanProducts product)
	{
		return this.productservice.addProduct(product);
		
	}
	
	@PutMapping("/loanproducts")
	public LoanProducts updateProduct(@RequestBody LoanProducts product)
	{
		
		return this.productservice.updateCourse(product);
		
	}
	
	
	@DeleteMapping("/loanproducts/{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId)
	{
		try {
			this.productservice.deleteProduct(Integer.parseInt(productId));
			return new ResponseEntity<>(HttpStatus.OK);
		} 
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	
	
	
}
