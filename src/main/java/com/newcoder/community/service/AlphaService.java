package com.newcoder.community.service;

import com.newcoder.community.dao.AlphaDao;
import jdk.nashorn.internal.runtime.PrototypeObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("Prototype")
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;


    public  AlphaService()
    {
        System.out.println("实例化AlphaService");

    }

    @PostConstruct
    public void init()
    {
        System.out.println("初始化AlphaService");

    }

    @PreDestroy
    public void  destory()
    {

        System.out.println("销毁AlphaService");
    }

    public String find()
    {

        return("Mybatis");
    }
}
