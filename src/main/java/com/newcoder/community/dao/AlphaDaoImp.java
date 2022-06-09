package com.newcoder.community.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
@Primary
public class AlphaDaoImp implements AlphaDao {
    @Override
    public String select() {
        return "alphaHibernate";
    }
}
