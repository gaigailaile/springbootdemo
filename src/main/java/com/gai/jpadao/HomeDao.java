package com.gai.jpadao;

import com.gai.domin.HomeJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeDao extends JpaRepository<HomeJpa,Integer> {
}
