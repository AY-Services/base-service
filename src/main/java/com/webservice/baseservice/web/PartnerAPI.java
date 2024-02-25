package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.dto.partner.PartnerDetails;
import com.webservice.baseservice.domain.dto.partner.PartnerModel;
import com.webservice.baseservice.service.PartnerService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PartnerAPI {


    private final PartnerService partnerService;
    //private final SecurityUtiles securityUtiles;


    public PartnerDetails createPartner(PartnerModel partnerModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        PartnerDetails partnerDetails = partnerService.createPartner(partnerModel);
        return partnerDetails;
    }

    protected PartnerDetails findPartner(String id) {
        PartnerDetails partnerDetails = partnerService.findPartner(id);
        return partnerDetails;
    }

    protected PartnerDetails updatePartner(String id, PartnerModel partnerModel) {
        PartnerDetails partnerDetails = partnerService.updatePartner(id, partnerModel);
        return partnerDetails;
    }



}

