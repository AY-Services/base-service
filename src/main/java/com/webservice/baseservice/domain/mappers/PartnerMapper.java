package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.partner.PartnerDetails;
import com.webservice.baseservice.domain.dto.partner.PartnerModel;
import com.webservice.baseservice.domain.entities.Partner;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PartnerMapper {

    PartnerDetails fromDbToDetails(Partner partnerDB);

    Partner fromModelToDb(PartnerModel partnerModel);
}