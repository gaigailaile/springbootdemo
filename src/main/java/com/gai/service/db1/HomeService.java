package com.gai.service.db1;

//import com.gai.dao.HomeDao;
import com.gai.domin.Home;
//import com.gai.domin.HomeJpa;
//import com.gai.jpadao.HomeDao;
import com.gai.mapper.db1.HomeMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HomeService {
//    @Autowired
//    private HomeDao homeDao;

    @Resource
    private HomeMapper1 homeMapper;

//    public void add(String name,String address){
//        homeDao.add(name, address);
//    }

//    public void add(String name,String address){
//        HomeJpa homeJpa = new HomeJpa();
//        homeJpa.setName(name);
//        homeJpa.setAddress(address);
//        homeDao.save(homeJpa);
//    }
    public void add(String name,String address){
        homeMapper.add(name, address);
    }

    public Home findByName(String name){
        return homeMapper.findByName(name);
    }
}
