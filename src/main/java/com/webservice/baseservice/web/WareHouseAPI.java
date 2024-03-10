package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.dto.wareHouse.WareHouseDetails;
import com.webservice.baseservice.domain.dto.wareHouse.WareHouseModel;
import com.webservice.baseservice.service.WareHouseService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WareHouseAPI {
    private final WareHouseService wareHouseService;
    //private final SecurityUtiles securityUtiles;


    public WareHouseDetails createWareHouse(WareHouseModel wareHouseModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        WareHouseDetails wareHouseDetails = wareHouseService.createWareHouse(wareHouseModel);
        return wareHouseDetails;
    }

    protected WareHouseDetails findWareHouse(String id) {
        WareHouseDetails wareHouseDetails = wareHouseService.findWareHouse(id);
        return wareHouseDetails;
    }

    protected WareHouseDetails updateWareHouse(String id, WareHouseModel wareHouseModel) {
        WareHouseDetails wareHouseDetails = wareHouseService.updateWareHouse(id, wareHouseModel);
        return wareHouseDetails;
    }


}

