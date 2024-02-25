package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.brand.BrandDetails;
import com.webservice.baseservice.domain.dto.brand.BrandModel;
import com.webservice.baseservice.domain.entities.Brand;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BrandMapper {

    BrandDetails fromDbToDetails(Brand brandDB);

    Brand fromModelToDb(BrandModel brandModel);
}