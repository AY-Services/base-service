package com.webservice.baseservice.service;


import com.webservice.baseservice.domain.dto.document.DocumentDetails;
import com.webservice.baseservice.domain.dto.document.DocumentModel;
import com.webservice.baseservice.domain.dto.document.DocumentDetails;
import com.webservice.baseservice.domain.entities.Document;
import com.webservice.baseservice.domain.entities.Document;
import com.webservice.baseservice.domain.mappers.DocumentMapper;
import com.webservice.baseservice.domain.repository.DocumentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {


    private final DocumentRepository documentRepository;
    private final DocumentMapper documentMapper;

    public DocumentService(DocumentRepository documentRepository, DocumentMapper documentMapper) {
        this.documentRepository = documentRepository;
        this.documentMapper = documentMapper;
    }


    public DocumentDetails createDocument(DocumentModel documentModel) {
        Document documentDb = documentMapper.fromModelToDb(documentModel);
        Document result = documentRepository.save(documentDb);
        DocumentDetails documentDetails = documentMapper.fromDbToDetails(result);
        return documentDetails;
    }

    public DocumentDetails findDocument(String id) {
        Document documentDB = documentRepository.findById(id).orElse(null);
        DocumentDetails documentDetails = documentMapper.fromDbToDetails(documentDB);
        return documentDetails;
    }

    public DocumentDetails updateDocument(String id, DocumentModel documentModel) {
        Document documentDB = documentRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(documentModel, documentDB, "id");
        Document newDocument = documentRepository.saveAndFlush(documentDB);
        DocumentDetails documentDetails = documentMapper.fromDbToDetails(newDocument);
        return documentDetails;

    }
}
