package com.webservice.baseservice.domain.mappers;


import com.webservice.baseservice.domain.dto.document.DocumentDetails;
import com.webservice.baseservice.domain.dto.document.DocumentModel;
import com.webservice.baseservice.domain.entities.Document;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface DocumentMapper {

    DocumentDetails fromDbToDetails(Document documentDB);

    Document fromModelToDb(DocumentModel documentModel);
}