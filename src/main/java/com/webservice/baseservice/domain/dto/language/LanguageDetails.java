package com.webservice.baseservice.domain.dto.language;



import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LanguageDetails {
    private String id;
    private Long version;
    private Date created_at;
    private String languageCode;
    private String name;
    private Integer rank;

}
