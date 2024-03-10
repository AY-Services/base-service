package com.webservice.baseservice.service;


import com.webservice.baseservice.domain.dto.language.LanguageDetails;
import com.webservice.baseservice.domain.dto.language.LanguageDetails;
import com.webservice.baseservice.domain.dto.language.LanguageModel;
import com.webservice.baseservice.domain.dto.language.LanguageDetails;
import com.webservice.baseservice.domain.entities.Language;
import com.webservice.baseservice.domain.entities.Language;
import com.webservice.baseservice.domain.entities.Language;
import com.webservice.baseservice.domain.mappers.LanguageMapper;
import com.webservice.baseservice.domain.repository.LanguageRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    private final LanguageRepository languageRepository;
    private final LanguageMapper languageMapper;

    public LanguageService(LanguageRepository languageRepository, LanguageMapper languageMapper) {
        this.languageRepository = languageRepository;
        this.languageMapper = languageMapper;
    }


    public LanguageDetails createLanguage(LanguageModel languageModel) {
        Language languageDb = languageMapper.fromModelToDb(languageModel);
        Language result = languageRepository.save(languageDb);
        LanguageDetails languageDetails = languageMapper.fromDbToDetails(result);
        return languageDetails;    }

    public LanguageDetails findLanguage(String id) {
        Language languageDB = languageRepository.findById(id).orElse(null);
        LanguageDetails languageDetails = languageMapper.fromDbToDetails(languageDB);
        return languageDetails;
    }

    public LanguageDetails updateLanguage(String id, LanguageModel languageModel) {
        Language languageDB = languageRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(languageModel, languageDB, "id");
        Language newLanguage = languageRepository.saveAndFlush(languageDB);
        LanguageDetails languageDetails = languageMapper.fromDbToDetails(newLanguage);
        return languageDetails;

    }
}
