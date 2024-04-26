package com.example.zzx.repository;

import com.example.zzx.entity.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberInfoRepo extends JpaRepository<MemberInfo, Integer> {

    //查询所有会员信息
    public List<MemberInfo> findAll();
}
