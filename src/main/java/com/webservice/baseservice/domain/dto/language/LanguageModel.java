package com.webservice.baseservice.domain.dto.language;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LanguageModel {

    private String languageCode;
    private String name;
    private Integer rank;

}
