package com.webservice.baseservice.service;


import com.webservice.baseservice.domain.dto.partner.PartnerDetails;
import com.webservice.baseservice.domain.dto.partner.PartnerDetails;
import com.webservice.baseservice.domain.dto.partner.PartnerModel;
import com.webservice.baseservice.domain.dto.partner.PartnerDetails;
import com.webservice.baseservice.domain.entities.Partner;
import com.webservice.baseservice.domain.entities.Partner;
import com.webservice.baseservice.domain.entities.Partner;
import com.webservice.baseservice.domain.mappers.PartnerMapper;
import com.webservice.baseservice.domain.repository.PartnerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {

    private final PartnerRepository partnerRepository;
    private final PartnerMapper partnerMapper;

    public PartnerService(PartnerRepository partnerRepository, PartnerMapper partnerMapper) {
        this.partnerRepository = partnerRepository;
        this.partnerMapper = partnerMapper;
    }


    public PartnerDetails createPartner(PartnerModel partnerModel) {
        Partner partnerDb = partnerMapper.fromModelToDb(partnerModel);
        Partner result = partnerRepository.save(partnerDb);
        PartnerDetails partnerDetails = partnerMapper.fromDbToDetails(result);
        return partnerDetails;    }

    public PartnerDetails findPartner(String id) {
        Partner partnerDB = partnerRepository.findById(id).orElse(null);
        PartnerDetails partnerDetails = partnerMapper.fromDbToDetails(partnerDB);
        return partnerDetails;
    }

    public PartnerDetails updatePartner(String id, PartnerModel partnerModel) {
        Partner partnerDB = partnerRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(partnerModel, partnerDB, "id");
        Partner newPartner = partnerRepository.saveAndFlush(partnerDB);
        PartnerDetails partnerDetails = partnerMapper.fromDbToDetails(newPartner);
        return partnerDetails;

    }
}
