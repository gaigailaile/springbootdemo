//package com.gai.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class HomeDao {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public void add(String name,String adress){
//        String sql = "insert into home(name,adress) values(?,?)";
//        jdbcTemplate.update(sql,name,adress);
//        System.out.println("添加成功！");
//    }
//}
