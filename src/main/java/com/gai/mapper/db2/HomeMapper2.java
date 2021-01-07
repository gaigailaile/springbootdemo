package com.gai.mapper.db2;

import com.gai.domin.Home;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HomeMapper2 {
    @Select("select * from home where name = #{name}")
    Home findByName(String name);

    @Insert("insert into home(name,address) values(#{name},#{address})")
    int add(String name,String address);
}
