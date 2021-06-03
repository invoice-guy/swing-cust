package com.cust.swing.dto;

import com.cust.swing.domain.Cust;
import lombok.Getter;

@Getter
public class CustResponseDto {
    private long custnum;
    private String custnm;

    public CustResponseDto(Cust entity) {
        this.custnum = entity.getId();
        this.custnm = entity.getCustnm();
    }
}

