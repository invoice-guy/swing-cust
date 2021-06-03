package com.cust.swing.web;

import com.cust.swing.domain.Cust;
import com.cust.swing.domain.CustRepositorySupport;
import com.cust.swing.dto.CustResponseDto;
import com.cust.swing.dto.CustSaveRequestDto;
import com.cust.swing.service.CustService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CustApiController {
    private final CustService custService;
    private final CustRepositorySupport custRepositorySupport;

    @PostMapping("/api/v1/cust")
    public void save(@RequestBody CustSaveRequestDto requestDto){
        custService.saveCust(requestDto);
    }

    @GetMapping("/api/v1/cust/{custnum}")
    public CustResponseDto find(@PathVariable long custnum){
        return custService.findById(custnum);
    }
}
