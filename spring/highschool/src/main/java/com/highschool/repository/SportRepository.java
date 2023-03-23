package com.highschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highschool.model.Sport;

public interface SportRepository extends JpaRepository<Sport, Long>{
    
}
