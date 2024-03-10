package com.webservice.baseservice.service;


import com.webservice.baseservice.domain.dto.brand.BrandDetails;
import com.webservice.baseservice.domain.dto.brand.BrandDetails;
import com.webservice.baseservice.domain.dto.brand.BrandModel;
import com.webservice.baseservice.domain.dto.brand.BrandDetails;
import com.webservice.baseservice.domain.entities.Brand;
import com.webservice.baseservice.domain.entities.Brand;
import com.webservice.baseservice.domain.entities.Brand;
import com.webservice.baseservice.domain.mappers.BrandMapper;
import com.webservice.baseservice.domain.repository.BrandRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class BrandService {

    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    public BrandService(BrandRepository brandRepository, BrandMapper brandMapper) {
        this.brandRepository = brandRepository;
        this.brandMapper = brandMapper;
    }


    public BrandDetails createBrand(BrandModel brandModel) {
        Brand brandDb = brandMapper.fromModelToDb(brandModel);
        Brand result = brandRepository.save(brandDb);
        BrandDetails brandDetails = brandMapper.fromDbToDetails(result);
        return brandDetails;
    }

    public BrandDetails findBrand(String id) {
        Brand brandDB = brandRepository.findById(id).orElse(null);
        BrandDetails brandDetails = brandMapper.fromDbToDetails(brandDB);
        return brandDetails;
    }

    public BrandDetails updateBrand(String id, BrandModel brandModel) {
        Brand brandDB = brandRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(brandModel, brandDB, "id","brandCode");
        Brand newBrand = brandRepository.saveAndFlush(brandDB);
        BrandDetails brandDetails = brandMapper.fromDbToDetails(newBrand);
        return brandDetails;

    }
}
