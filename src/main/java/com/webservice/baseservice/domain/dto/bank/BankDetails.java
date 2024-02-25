package com.webservice.baseservice.domain.dto.bank;


import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BankDetails {
    private String id;
    private Long version;
    private Date created_at;
    private String bankCode;
    private String name;
    private String iban;
}
