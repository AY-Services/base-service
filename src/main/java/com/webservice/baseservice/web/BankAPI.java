package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.dto.bank.BankDetails;
import com.webservice.baseservice.domain.dto.bank.BankModel;
import com.webservice.baseservice.service.BankService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BankAPI {

    private final BankService bankService;
    //private final SecurityUtiles securityUtiles;


    public BankDetails createBank(BankModel bankModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        BankDetails bankDetails = bankService.createBank(bankModel);
        return bankDetails;
    }

    protected BankDetails findBank(String id) {
        BankDetails bankDetails = bankService.findBank(id);
        return bankDetails;
    }

    protected BankDetails updateBank(String id, BankModel bankModel) {
        BankDetails bankDetails = bankService.updateBank(id, bankModel);
        return bankDetails;
    }

}

