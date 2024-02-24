package com.webservice.baseservice.webAdapter.rest;

import com.webservice.baseservice.domain.Support.SearchCritaria;
import com.webservice.baseservice.domain.dto.product.ProductDetails;
import com.webservice.baseservice.domain.dto.product.ProductModel;
import com.webservice.baseservice.service.ProductService;
import com.webservice.baseservice.web.ProductAPI;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController extends ProductAPI {


    public ProductController(ProductService productService) {
        super(productService);
    }

    @PostMapping("/save")
    public ProductDetails createProduct(@RequestBody ProductModel productModel){
        ProductDetails productDetails = super.createProduct(productModel);
        return productDetails;
    }
    @GetMapping("/find/{id}")
    public ProductDetails findProduct(@PathVariable String id){
        ProductDetails productDetails = super.findProduct(id);
        return productDetails;
    }
    @PutMapping("/update/{id}")
    public ProductDetails updateProduct(@PathVariable String id, @RequestBody ProductModel productModel ){
        return super.updateProduct(id, productModel);
    }

    /*@GetMapping("/findByFilter")
    public List<ProductDetails> findAllByFilter(SearchCritaria searchCritaria){
        return super.findAllByFilter(searchCritaria);
    }*/


}

