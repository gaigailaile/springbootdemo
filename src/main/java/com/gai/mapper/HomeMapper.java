package com.gai.mapper;

import com.gai.domin.Home;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HomeMapper {
    @Select("select * from home where name = #{name}")
    Home findByName(String name);
}
