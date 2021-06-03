package com.cust.swing.domain;

import com.cust.swing.dto.CustResponseDto;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.cust.swing.domain.QCust.cust;

@Repository
@Service
public class CustRepositorySupport extends QuerydslRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public CustRepositorySupport(JPAQueryFactory queryFactory) {
        super(Cust.class);
        this.queryFactory = queryFactory;
    }


}