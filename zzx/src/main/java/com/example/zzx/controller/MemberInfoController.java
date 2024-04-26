package com.example.zzx.controller;

import com.example.zzx.entity.MemberInfo;
import com.example.zzx.repository.MemberInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/memberInfo")
public class MemberInfoController {

    @Autowired
    private MemberInfoRepo memberInfoRepo;
    //查看会员
    @GetMapping("/view")
    public String getMember(Model m) {
        List<MemberInfo> MemberInfo = memberInfoRepo.findAll();
        m.addAttribute("memberInfo", MemberInfo);
        return "MemberList";
    }
}

