package com.webservice.baseservice.webAdapter.rest.document;

import com.webservice.baseservice.domain.dto.document.DocumentDetails;
import com.webservice.baseservice.domain.dto.document.DocumentModel;
import com.webservice.baseservice.service.DocumentService;
import com.webservice.baseservice.web.DocumentAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/document")
public class DocumentController extends DocumentAPI {


    public DocumentController(DocumentService documentService) {
        super(documentService);
    }

    @PostMapping("/save")
    public DocumentDetails createDocument(@RequestBody DocumentModel documentModel){
        DocumentDetails documentDetails = super.createDocument(documentModel);
        return documentDetails;
    }
    @GetMapping("/find/{id}")
    public DocumentDetails findDocument(@PathVariable String id){
        DocumentDetails documentDetails = super.findDocument(id);
        return documentDetails;
    }
    @PutMapping("/update/{id}")
    public DocumentDetails updateDocument(@PathVariable String id, @RequestBody DocumentModel documentModel ){
        return super.updateDocument(id, documentModel);
    }


}

