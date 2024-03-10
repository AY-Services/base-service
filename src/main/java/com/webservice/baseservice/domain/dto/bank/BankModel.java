package com.webservice.baseservice.domain.dto.bank;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BankModel {
    private String name;
    private String iban;
}
