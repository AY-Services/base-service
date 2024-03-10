package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.wareHouse.WareHouseDetails;
import com.webservice.baseservice.domain.dto.wareHouse.WareHouseModel;
import com.webservice.baseservice.domain.entities.WareHouse;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface WareHouseMapper {

    WareHouseDetails fromDbToDetails(WareHouse wareHouseDB);

    WareHouse fromModelToDb(WareHouseModel wareHouseModel);
}