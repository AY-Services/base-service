package com.webservice.baseservice.service;



import com.webservice.baseservice.domain.dto.wareHouse.WareHouseDetails;
import com.webservice.baseservice.domain.dto.wareHouse.WareHouseDetails;
import com.webservice.baseservice.domain.dto.wareHouse.WareHouseModel;
import com.webservice.baseservice.domain.entities.WareHouse;
import com.webservice.baseservice.domain.mappers.WareHouseMapper;
import com.webservice.baseservice.domain.repository.WareHouseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class WareHouseService {

    private final WareHouseRepository wareHouseRepository;
    private final WareHouseMapper wareHouseMapper;

    public WareHouseService(WareHouseRepository wareHouseRepository, WareHouseMapper wareHouseMapper) {
        this.wareHouseRepository = wareHouseRepository;
        this.wareHouseMapper = wareHouseMapper;
    }

    public WareHouseDetails createWareHouse(WareHouseModel wareHouseModel) {
        WareHouse wareHouseDb = wareHouseMapper.fromModelToDb(wareHouseModel);
        WareHouse result = wareHouseRepository.save(wareHouseDb);
        WareHouseDetails wareHouseDetails = wareHouseMapper.fromDbToDetails(result);
        return wareHouseDetails;
    }

    public WareHouseDetails findWareHouse(String id) {
        WareHouse wareHouseDB = wareHouseRepository.findById(id).orElse(null);
        WareHouseDetails wareHouseDetails = wareHouseMapper.fromDbToDetails(wareHouseDB);
        return wareHouseDetails;
    }

    public WareHouseDetails updateWareHouse(String id, WareHouseModel wareHouseModel) {
        WareHouse wareHouseDB = wareHouseRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(wareHouseModel, wareHouseDB, "id","warehouseCode");
        WareHouse newWareHouse = wareHouseRepository.saveAndFlush(wareHouseDB);
        WareHouseDetails wareHouseDetails = wareHouseMapper.fromDbToDetails(newWareHouse);
        return wareHouseDetails;

    }
}
