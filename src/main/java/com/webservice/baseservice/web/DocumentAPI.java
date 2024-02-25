package com.webservice.baseservice.web;


import com.webservice.baseservice.domain.dto.document.DocumentDetails;
import com.webservice.baseservice.domain.dto.document.DocumentModel;
import com.webservice.baseservice.service.DocumentService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DocumentAPI {

    private final DocumentService documentService;
    //private final SecurityUtiles securityUtiles;


    public DocumentDetails createDocument(DocumentModel documentModel) {
        //UserInfo user = securityUtiles.getLoggedInUser();
        DocumentDetails documentDetails = documentService.createDocument(documentModel);
        return documentDetails;
    }

    protected DocumentDetails findDocument(String id) {
        DocumentDetails documentDetails = documentService.findDocument(id);
        return documentDetails;
    }

    protected DocumentDetails updateDocument(String id, DocumentModel documentModel) {
        DocumentDetails documentDetails = documentService.updateDocument(id, documentModel);
        return documentDetails;
    }


}

