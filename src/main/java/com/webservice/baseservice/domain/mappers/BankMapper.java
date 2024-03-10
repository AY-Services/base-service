package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.bank.BankDetails;
import com.webservice.baseservice.domain.dto.bank.BankModel;
import com.webservice.baseservice.domain.entities.Bank;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface BankMapper {

    BankDetails fromDbToDetails(Bank bankDB);

    Bank fromModelToDb(BankModel bankModel);
}