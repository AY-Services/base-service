package com.webservice.baseservice.webAdapter.rest.bank;

import com.webservice.baseservice.domain.dto.bank.BankDetails;
import com.webservice.baseservice.domain.dto.bank.BankModel;
import com.webservice.baseservice.service.BankService;
import com.webservice.baseservice.web.BankAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bank")
public class BankController extends BankAPI {


    public BankController(BankService bankService) {
        super(bankService);
    }

    @PostMapping("/save")
    public BankDetails createBank(@RequestBody BankModel bankModel){
        BankDetails bankDetails = super.createBank(bankModel);
        return bankDetails;
    }
    @GetMapping("/find/{id}")
    public BankDetails findBank(@PathVariable String id){
        BankDetails bankDetails = super.findBank(id);
        return bankDetails;
    }
    @PutMapping("/update/{id}")
    public BankDetails updateBank(@PathVariable String id, @RequestBody BankModel bankModel ){
        return super.updateBank(id, bankModel);
    }


}

