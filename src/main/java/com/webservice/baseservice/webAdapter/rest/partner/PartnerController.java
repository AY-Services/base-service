package com.webservice.baseservice.webAdapter.rest.partner;

import com.webservice.baseservice.domain.dto.partner.PartnerDetails;
import com.webservice.baseservice.domain.dto.partner.PartnerModel;
import com.webservice.baseservice.service.PartnerService;
import com.webservice.baseservice.web.PartnerAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/partner")
public class PartnerController extends PartnerAPI {


    public PartnerController(PartnerService partnerService) {
        super(partnerService);
    }

    @PostMapping("/save")
    public PartnerDetails createPartner(@RequestBody PartnerModel partnerModel){
        PartnerDetails partnerDetails = super.createPartner(partnerModel);
        return partnerDetails;
    }
    @GetMapping("/find/{id}")
    public PartnerDetails findPartner(@PathVariable String id){
        PartnerDetails partnerDetails = super.findPartner(id);
        return partnerDetails;
    }
    @PutMapping("/update/{id}")
    public PartnerDetails updatePartner(@PathVariable String id, @RequestBody PartnerModel partnerModel ){
        return super.updatePartner(id, partnerModel);
    }


}

