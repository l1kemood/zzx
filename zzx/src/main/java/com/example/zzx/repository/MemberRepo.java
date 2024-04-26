package com.example.zzx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zzx.entity.Member;

@Repository
public interface MemberRepo extends JpaRepository<Member, Integer> {

    //查询所有会员
    public List<Member> findAll();
    //根据name查询会员
    public List<Member> findByName(String name);
}
