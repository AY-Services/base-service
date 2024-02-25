package com.webservice.baseservice.domain.dto.document;



import com.webservice.baseservice.domain.Support.BaseEntity;
import com.webservice.baseservice.domain.entities.Partner;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DocumentModel {

    private Partner partner;
    private DocumentModel document;
    private String documentType;
    private String description;


}

