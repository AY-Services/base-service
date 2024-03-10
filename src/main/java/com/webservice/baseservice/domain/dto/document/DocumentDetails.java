package com.webservice.baseservice.domain.dto.document;



import com.webservice.baseservice.domain.Support.BaseEntity;
import com.webservice.baseservice.domain.entities.Partner;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DocumentDetails {
    private String id;
    private Long version;
    private Date created_at;
    private Partner partner;

    private DocumentDetails document;
    private String documentType;
    private String description;


}

