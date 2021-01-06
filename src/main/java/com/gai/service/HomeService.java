package com.gai.service;

//import com.gai.dao.HomeDao;
import com.gai.domin.Home;
import com.gai.domin.HomeJpa;
import com.gai.jpadao.HomeDao;
import com.gai.mapper.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HomeService {
    @Autowired
    private HomeDao homeDao;

    @Resource
    private HomeMapper homeMapper;

//    public void add(String name,String address){
//        homeDao.add(name, address);
//    }

    public void add(String name,String address){
        HomeJpa homeJpa = new HomeJpa();
        homeJpa.setName(name);
        homeJpa.setAddress(address);
        homeDao.save(homeJpa);
    }

    public Home findByName(String name){
        return homeMapper.findByName(name);
    }
}
