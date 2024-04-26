package com.example.zzx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.zzx.entity.Member;
import com.example.zzx.repository.MemberRepo;


@Controller
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberRepo memberRepo;

    //查看会员
    @GetMapping("/view")
    public String getMember(Model m) {
        List<Member> MemberList = memberRepo.findAll();
        m.addAttribute("memberList", MemberList);
        return "MemberList";
    }

    //添加会员
    @GetMapping("/add_member")
    public String getAddMember(Model model) {
        model.addAttribute("member", new Member());
        return "AddMember";

    }

    @PostMapping("/add_member")
    public String postAddMemebr(@ModelAttribute Member member, Model m) {
        memberRepo.save(member);
        List<Member> MemberList = memberRepo.findAll();
        m.addAttribute("memberList", MemberList);
        return "MemberList";
    }

    //删除会员
    @DeleteMapping("/{id}")
    public String deleteMember(@PathVariable int id) {
        memberRepo.deleteById(id);
        return "deleteMember";
    }

    //按名字查询会员
    @GetMapping("/name")
    public String getMemberByName(@RequestParam String name, Model model) {
        List<Member> Members = memberRepo.findByName(name);
        model.addAttribute("members", Members);
        return "MemberList";
    }


/*    @GetMapping("/name/{name}")
    public List<Member> getMemberByName(@PathVariable String name, Model m2) {
        return memberRepo.findByName(name);*/

        /*List<Member> MemberList = memberRepo.findByName(name);
        m2.getAttribute("memberlist", MemberList);
        return "MemberList";*/
}

