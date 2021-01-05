package com.gai.service;

import com.gai.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    @Autowired
    private HomeDao homeDao;

    public void add(String name,String adress){
        homeDao.add(name, adress);
    }
}
