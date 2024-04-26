package com.example.zzx.controller;

import com.example.zzx.entity.FitnessPlanType;
import com.example.zzx.repository.FitnessPlanTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/fitnessPlanType")
public class FitnessPlanController {
    @Autowired
    private FitnessPlanTypeRepo fitnessPlanTypeRepo;

    //查看健身计划类型
    @GetMapping("/view")
    public String getFitnessPlanType(Model m) {
        List<FitnessPlanType> FitnessPlanType = fitnessPlanTypeRepo.findAll();
        m.addAttribute("fitnessPlanType", FitnessPlanType);
        return "MemberList";
    }

    //添加健身计划类型
    @GetMapping("/add_fitnessPlanType")
    public String getAddFitnessPlanType(Model m2) {
        m2.addAttribute("fitnessPlanType", new FitnessPlanType());
        return "AddFitnessPlanType";
    }

    @PostMapping ("/add_fitnessPlanType")
        public String postAddFitnessPlanType(@ModelAttribute FitnessPlanType fitnessPlanType, Model m3){
            fitnessPlanTypeRepo.save(fitnessPlanType);
            List<FitnessPlanType> FitnessPlanType = fitnessPlanTypeRepo.findAll();
            m3.addAttribute("fitnessPlanType", FitnessPlanType);
            return "fitnessPlanType";
        }

    //删除健身计划类型
    @DeleteMapping("/delete_fitnessPlanType")
    public String deleteFitnessPlanType(@PathVariable int id) {
        fitnessPlanTypeRepo.deleteById(id);
        return "deleteMember";
    }


}

