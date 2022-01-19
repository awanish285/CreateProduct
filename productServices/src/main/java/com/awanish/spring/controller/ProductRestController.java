package com.awanish.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.awanish.spring.dto.Coupon;
import com.awanish.spring.model.Product;
import com.awanish.spring.repositery.ProductRepo;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
	@Autowired
	ProductRepo productrepo;
	
	@Autowired
	RestTemplate restTemplate;
	@Value("${couponService.url}")
	private String couponServiceUrl;
	
	//coupon.class is the data transfer object (normal plain java class to hold the response of the couponservices

    //this method is used to create the product and used coupon service to give discount on the product
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public Product create(@RequestBody Product product) {
        
		Coupon coupon = restTemplate.getForObject(couponServiceUrl+ product.getCoupon(),Coupon.class);
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return productrepo.save(product);
	}

}
