package com.webservice.baseservice.domain.repository;

import com.webservice.baseservice.domain.Support.ProductFilter;
import com.webservice.baseservice.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {
    //List<Product> findByProductFilter(ProductFilter productFilter);
}
