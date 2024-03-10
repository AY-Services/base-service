package com.webservice.baseservice.service;

import com.webservice.baseservice.domain.Support.ProductFilter;
import com.webservice.baseservice.domain.Support.ProductSearch;
import com.webservice.baseservice.domain.dto.product.ProductDetails;
import com.webservice.baseservice.domain.dto.product.ProductModel;
import com.webservice.baseservice.domain.entities.Brand;
import com.webservice.baseservice.domain.entities.Product;
import com.webservice.baseservice.domain.mappers.ProductMapper;
import com.webservice.baseservice.domain.repository.BrandRepository;
import com.webservice.baseservice.domain.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final BrandRepository brandRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, BrandRepository brandRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.brandRepository = brandRepository;
        this.productMapper = productMapper;
    }


    public ProductDetails createProduct(ProductModel productModel) {
        Product product_db_Mapper = productMapper.fromModelToDb(productModel);
        Brand brand = product_db_Mapper.getBrand();
        product_db_Mapper.setBrand(null);
        Brand brandDb = brandRepository.save(brand);
        Product productDB = productRepository.save(product_db_Mapper);
        productDB.setBrand(brandDb);
        ProductDetails productDetails = productMapper.fromDbToDetails(productDB);
        return productDetails;
    }

    public ProductDetails findProduct(String id) {
        Product productDB = productRepository.findById(id).orElse(null);
        ProductDetails productDetails = productMapper.fromDbToDetails(productDB);
        return productDetails;
    }

    public ProductDetails updateProduct(String id, ProductModel productModel) {
        Product productDB = productRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(productModel, productDB, "id");
        Product newProduct = productRepository.saveAndFlush(productDB);
        ProductDetails productDetails = productMapper.fromDbToDetails(newProduct);
        return productDetails;

    }

    /*public List<ProductDetails> findAllByFilter(ProductSearch productSearch) {
        ProductFilter productFilter = productMapper.productSearchToProductFilter(productSearch);
        List<Product> productsList = productRepository.findByProductFilter(productFilter);
        List<ProductDetails> productDetailsList = Collections.emptyList();

        if(productsList != null){
            productDetailsList = productsList.stream().map(
                productMapper::fromDbToDetails
            ).collect(Collectors.toList());
        }
        return  productDetailsList;
    }*/
}
