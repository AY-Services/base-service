package com.webservice.baseservice.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Kpi {

    private String kpiCode;
    private String title;
    private Double value;
    private Double valueP;
    private String unit;

    private String value10;
    private String value10P;
    private String value11;
    private String value20;
    private String value20P;
    private String value21;
    private String value30;
    private String value30P;
    private String value31;
    private String value40;
    private String value40P;
    private String value41;
    private String value1Label;
    private String value2Label;
    private String value3Label;
    private String value4Label;

    private String  color				= "orange";
    private Integer valuesFontSize		= 14;
    private String 	valuesColor			= "gray";

    private String  valuesFontWeight	= "bold";
    private Integer labelFontSize		= 12;
    private String  labelFontWeight		= "regular";



}

