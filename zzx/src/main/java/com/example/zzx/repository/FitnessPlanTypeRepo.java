package com.example.zzx.repository;

import com.example.zzx.entity.FitnessPlanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FitnessPlanTypeRepo extends JpaRepository<FitnessPlanType, Integer> {
    //查询所有健身计划类型
    public List<FitnessPlanType> findAll();
}
