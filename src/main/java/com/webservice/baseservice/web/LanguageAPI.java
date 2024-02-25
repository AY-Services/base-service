package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.dto.language.LanguageDetails;
import com.webservice.baseservice.domain.dto.language.LanguageModel;
import com.webservice.baseservice.service.LanguageService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LanguageAPI {


    private final LanguageService languageService;
    //private final SecurityUtiles securityUtiles;


    public LanguageDetails createLanguage(LanguageModel languageModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        LanguageDetails languageDetails = languageService.createLanguage(languageModel);
        return languageDetails;
    }

    protected LanguageDetails findLanguage(String id) {
        LanguageDetails languageDetails = languageService.findLanguage(id);
        return languageDetails;
    }

    protected LanguageDetails updateLanguage(String id, LanguageModel languageModel) {
        LanguageDetails languageDetails = languageService.updateLanguage(id, languageModel);
        return languageDetails;
    }




}

