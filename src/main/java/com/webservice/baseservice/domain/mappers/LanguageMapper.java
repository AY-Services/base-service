package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.language.LanguageDetails;
import com.webservice.baseservice.domain.dto.language.LanguageModel;
import com.webservice.baseservice.domain.entities.Language;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface LanguageMapper {

    LanguageDetails fromDbToDetails(Language languageDB);

    Language fromModelToDb(LanguageModel languageModel);
}