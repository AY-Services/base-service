package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.dto.brand.BrandDetails;
import com.webservice.baseservice.domain.dto.brand.BrandModel;
import com.webservice.baseservice.service.BrandService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrandAPI {
    private final BrandService brandService;
    //private final SecurityUtiles securityUtiles;


    public BrandDetails createBrand(BrandModel brandModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        BrandDetails brandDetails = brandService.createBrand(brandModel);
        return brandDetails;
    }

    protected BrandDetails findBrand(String id) {
        BrandDetails brandDetails = brandService.findBrand(id);
        return brandDetails;
    }

    protected BrandDetails updateBrand(String id, BrandModel brandModel) {
        BrandDetails brandDetails = brandService.updateBrand(id, brandModel);
        return brandDetails;
    }

}

