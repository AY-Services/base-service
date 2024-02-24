package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.Support.SearchCritaria;
import com.webservice.baseservice.domain.dto.product.ProductDetails;
import com.webservice.baseservice.domain.dto.product.ProductModel;
import com.webservice.baseservice.service.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductAPI {

    private final ProductService productService;
    //private final SecurityUtiles securityUtiles;


    public ProductDetails createProduct(ProductModel productModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        ProductDetails productDetails = productService.createProduct(productModel);
        return productDetails;
    }

    protected ProductDetails findProduct(String id) {
        ProductDetails productDetails = productService.findProduct(id);
        return productDetails;
    }

    protected ProductDetails updateProduct(String id, ProductModel productModel) {
        ProductDetails productDetails = productService.updateProduct(id, productModel);
        return productDetails;
    }


    /*protected List<ProductDetails> findAllByFilter(SearchCritaria searchCritaria) {
        return productService.findAllByFilter(searchCritaria);
    }*/
}

