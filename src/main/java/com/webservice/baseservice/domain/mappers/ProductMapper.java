package com.webservice.baseservice.domain.mappers;

import com.webservice.baseservice.domain.dto.product.ProductDetails;
import com.webservice.baseservice.domain.dto.product.ProductModel;
import com.webservice.baseservice.domain.entities.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product fromModelToDb(ProductModel productModel);

    List<ProductDetails> fromDbToDetails(List<Product> result);

    ProductDetails fromDbToDetails(Product newProduct);
}