package com.webservice.baseservice.webAdapter.rest.brand;

import com.webservice.baseservice.domain.dto.brand.BrandDetails;
import com.webservice.baseservice.domain.dto.brand.BrandModel;
import com.webservice.baseservice.service.BankService;
import com.webservice.baseservice.service.BrandService;
import com.webservice.baseservice.web.BrandAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/brand")
public class BrandController extends BrandAPI {


    public BrandController(BrandService brandService) {
        super(brandService);
    }

    @PostMapping("/save")
    public BrandDetails createBrand(@RequestBody BrandModel brandModel){
        BrandDetails brandDetails = super.createBrand(brandModel);
        return brandDetails;
    }
    @GetMapping("/find/{id}")
    public BrandDetails findBrand(@PathVariable String id){
        BrandDetails brandDetails = super.findBrand(id);
        return brandDetails;
    }
    @PutMapping("/update/{id}")
    public BrandDetails updateBrand(@PathVariable String id, @RequestBody BrandModel brandModel ){
        return super.updateBrand(id, brandModel);
    }


}

