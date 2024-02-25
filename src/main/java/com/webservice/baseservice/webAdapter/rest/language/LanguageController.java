package com.webservice.baseservice.webAdapter.rest.language;

import com.webservice.baseservice.domain.dto.language.LanguageDetails;
import com.webservice.baseservice.domain.dto.language.LanguageModel;
import com.webservice.baseservice.service.LanguageService;
import com.webservice.baseservice.web.LanguageAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/language")
public class LanguageController extends LanguageAPI {


    public LanguageController(LanguageService languageService) {
        super(languageService);
    }

    @PostMapping("/save")
    public LanguageDetails createLanguage(@RequestBody LanguageModel languageModel){
        LanguageDetails languageDetails = super.createLanguage(languageModel);
        return languageDetails;
    }
    @GetMapping("/find/{id}")
    public LanguageDetails findLanguage(@PathVariable String id){
        LanguageDetails languageDetails = super.findLanguage(id);
        return languageDetails;
    }
    @PutMapping("/update/{id}")
    public LanguageDetails updateLanguage(@PathVariable String id, @RequestBody LanguageModel languageModel ){
        return super.updateLanguage(id, languageModel);
    }


}

