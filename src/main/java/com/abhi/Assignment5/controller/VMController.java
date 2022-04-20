package com.abhi.Assignment5.controller;

import com.abhi.Assignment5.entity.CloudServiceCategory;
import com.abhi.Assignment5.entity.ComputeServices;
import com.abhi.Assignment5.repostitory.VMRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class VMController {
    @Autowired
    private VMRepos vmRepos;

    //Check
    @GetMapping("/VM")
    public String check(){
        return "Abhinav Aditya  VM";
    }

    //CREATE
    @PostMapping("/addVM")
    public ComputeServices addVM(@RequestBody ComputeServices computeServices ){
        return vmRepos.save(computeServices);
    }

    //GET
    @GetMapping("/getVM")
    public List<ComputeServices> getVM(){
        return vmRepos.findAll();
    }

}
