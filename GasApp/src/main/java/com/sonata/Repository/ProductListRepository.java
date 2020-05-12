package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.Model.ProductList;

@Repository
	public interface ProductListRepository extends JpaRepository<ProductList, Long> {
	
	

}
