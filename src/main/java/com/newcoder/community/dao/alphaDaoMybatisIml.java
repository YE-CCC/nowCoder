package com.newcoder.community.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("alphaMybatis")

public class alphaDaoMybatisIml implements AlphaDao {


    @Override
    public String select() {
        return "mybatisImp";
    }
}
