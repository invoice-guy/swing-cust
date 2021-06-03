package com.cust.swing.service;


import com.cust.swing.domain.Cust;
import com.cust.swing.domain.CustRepository;
import com.cust.swing.dto.CustResponseDto;
import com.cust.swing.dto.CustSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CustService {
    private final CustRepository custRepository;

    @Transactional
    public void saveCust(CustSaveRequestDto requestDto) {
        custRepository.save(requestDto.toEntity());
    }

    @Transactional
    public CustResponseDto findById(long id) {
        Cust cust = custRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new CustResponseDto(cust);
    }

}
