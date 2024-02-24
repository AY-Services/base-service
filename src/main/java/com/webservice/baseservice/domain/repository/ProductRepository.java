package com.webservice.baseservice.domain.repository;

import com.webservice.baseservice.domain.Support.SearchCritaria;
import com.webservice.baseservice.domain.dto.product.ProductDetails;
import com.webservice.baseservice.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    //List<Product> findAllProductsBySearchCriteria(SearchCritaria searchCritaria);
}
