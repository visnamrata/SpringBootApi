package com.restapi.loanapi.services;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.loanapi.dao.ProductDao;
import com.restapi.loanapi.entities.LoanProducts;

@Service
public class ServiceImpl implements ProductService
{
	@Autowired
	private ProductDao productDao;
	
//	List<LoanProducts> products;
//	
//	public ServiceImpl() {
//		products=new ArrayList<>();
//		products.add(new LoanProducts(101,"Business Loan",20000,9,7.5, true,"Rapipay", LocalDateTime.now(),"Rohan", LocalDateTime.of(20, 7, 30, 8, 54)));
//		products.add(new LoanProducts(102,"Educational Loan",37800,19,5.5, false,"Ritick", LocalDateTime.now(),"Sankalp", LocalDateTime.of(18, 10, 20, 3, 34)));
//	}





	@Override
	public List<LoanProducts> getProducts() {
		// TODO Auto-generated method stub
		//return products;
		return productDao.findAll();
	}


	@SuppressWarnings("deprecation")
	@Override
	public LoanProducts getProduct(int productId) {
		// TODO Auto-generated method stub
//		LoanProducts pid=null;
//		for (LoanProducts loanProducts : products) {
//			if(loanProducts.getProductId()==productId)
//			{
//				pid=loanProducts;
//				break;
//			}
//			
//		}
//		return pid;
		
		return productDao.getOne(productId);
		}



	@Override
	public LoanProducts addProduct(LoanProducts product) {
		// TODO Auto-generated method stub
//		products.add(product);
		productDao.save(product);
		return product;
	}

	





	@Override
	public void deleteProduct(int parseInt) {
		// TODO Auto-generated method stub
		//products=this.products.stream().filter(e->e.getProductId()!=parseInt).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		LoanProducts entity=productDao.getOne(parseInt);
		productDao.delete(entity);
		
	}


	@Override
	public LoanProducts updateCourse(LoanProducts product) {
		// TODO Auto-generated method stub
		productDao.save(product);
		return product;
	}
	
	
	
	

}
