package com.webservice.baseservice.webAdapter.rest.warehouse;


import com.webservice.baseservice.domain.dto.wareHouse.WareHouseDetails;
import com.webservice.baseservice.domain.dto.wareHouse.WareHouseModel;
import com.webservice.baseservice.service.WareHouseService;
import com.webservice.baseservice.web.WareHouseAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/warehouse")
public class WareHouseController extends WareHouseAPI {


    public WareHouseController(WareHouseService wareHouseService) {
        super(wareHouseService);
    }

    @PostMapping("/save")
    public WareHouseDetails createWareHouse(@RequestBody WareHouseModel userModel){
        WareHouseDetails userDetails = super.createWareHouse(userModel);
        return userDetails;
    }
    @GetMapping("/find/{id}")
    public WareHouseDetails findWareHouse(@PathVariable String id){
        WareHouseDetails userDetails = super.findWareHouse(id);
        return userDetails;
    }
    @PutMapping("/update/{id}")
    public WareHouseDetails updateWareHouse(@PathVariable String id, @RequestBody WareHouseModel userModel ){
        return super.updateWareHouse(id, userModel);
    }

    /*@GetMapping("/findByFilter")
    public List<WareHouseDetails> findAllByFilter(SearchCritaria searchCritaria){
        return super.findAllByFilter(searchCritaria);
    }*/


}

