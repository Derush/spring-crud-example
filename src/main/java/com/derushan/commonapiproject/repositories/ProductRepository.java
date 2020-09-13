/**
 * 
 */
package com.derushan.commonapiproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.derushan.commonapiproject.entities.Product;

/**
 * @author Derushan
 * Sep 13, 2020
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{

	/**
	 * @param name
	 * @return
	 */
	Product findByName(String name);
	
	

}
