package com.example.backend.RepoCustom.Impl;

import com.example.backend.Entity.QSiteUser;
import com.example.backend.Entity.SiteUser;
import com.example.backend.RepoCustom.SiteUserRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SiteUserRepositoryCustomImpl implements SiteUserRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    QSiteUser qSiteUser = QSiteUser.siteUser;


    public SiteUser findByUserName(String username){

        return jpaQueryFactory.selectFrom(qSiteUser).where(qSiteUser.id.eq(username)).fetchOne();
    }
}
