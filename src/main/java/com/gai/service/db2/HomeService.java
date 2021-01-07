package com.gai.service.db2;

//import com.gai.dao.HomeDao;
import com.gai.domin.Home;
//import com.gai.domin.HomeJpa;
//import com.gai.jpadao.HomeDao;
import com.gai.mapper.db2.HomeMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "homeService2")
public class HomeService {

    @Resource
    private HomeMapper2 homeMapper;

    public Home findByName(String name){
        return homeMapper.findByName(name);
    }

    public void add(String name,String address){
        homeMapper.add(name, address);
    }
}
