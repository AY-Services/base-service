package com.webservice.baseservice.service;


import com.webservice.baseservice.domain.dto.bank.BankDetails;
import com.webservice.baseservice.domain.dto.bank.BankModel;
import com.webservice.baseservice.domain.dto.bank.BankDetails;
import com.webservice.baseservice.domain.entities.Bank;
import com.webservice.baseservice.domain.entities.Bank;
import com.webservice.baseservice.domain.mappers.BankMapper;
import com.webservice.baseservice.domain.repository.BankRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    private final BankRepository bankRepository;
    private final BankMapper bankMapper;

    public BankService(BankRepository bankRepository, BankMapper bankMapper) {
        this.bankRepository = bankRepository;
        this.bankMapper = bankMapper;
    }


    public BankDetails createBank(BankModel bankModel) {
        Bank bankDb = bankMapper.fromModelToDb(bankModel);
        Bank result = bankRepository.save(bankDb);
        BankDetails bankDetails = bankMapper.fromDbToDetails(result);
        return bankDetails;
    }

    public BankDetails findBank(String id) {
        Bank bankDB = bankRepository.findById(id).orElse(null);
        BankDetails bankDetails = bankMapper.fromDbToDetails(bankDB);
        return bankDetails;
    }

    public BankDetails updateBank(String id, BankModel bankModel) {
        Bank bankDB = bankRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(bankModel, bankDB, "id","bankCode");
        Bank newBank = bankRepository.saveAndFlush(bankDB);
        BankDetails bankDetails = bankMapper.fromDbToDetails(newBank);
        return bankDetails;

    }
}
