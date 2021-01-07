package com.gai.mapper.db1;

import com.gai.domin.Home;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HomeMapper1 {
    @Select("select * from home where name = #{name}")
    Home findByName(String name);

    @Insert("insert into home(name,address) values(#{name},#{address})")
    int add(String name,String address);
}
