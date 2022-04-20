package com.abhi.Assignment5.controller;

import com.abhi.Assignment5.entity.CloudServiceCategory;
import com.abhi.Assignment5.repostitory.CloudServiceCategoryRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

    @Autowired
    private CloudServiceCategoryRepos cloudServiceCategoryRepos;



//Check
    @GetMapping("/category")
    public String check(){
        return "Abhinav Aditya";
    }


//GET
    @GetMapping("/getCategories")
    public Map<Integer, CloudServiceCategory> getCategories() {
        List<CloudServiceCategory> list= cloudServiceCategoryRepos.findAll();
        Map<Integer, CloudServiceCategory> map = new HashMap<Integer, CloudServiceCategory>();
        for (int i=0;i<list.size();i++){
            map.put(i,list.get(i));
        };
        return map;
    }
//CREATE
    @PostMapping("/addCategory")
    public CloudServiceCategory addCategory(@RequestBody CloudServiceCategory cloudServiceCategory) {
        return cloudServiceCategoryRepos.save(cloudServiceCategory);
    }
//UPDATE
    @PutMapping("/updateCategory")
    public CloudServiceCategory updateCategory(@RequestBody CloudServiceCategory cloudServiceCategory) {
        return cloudServiceCategoryRepos.save(cloudServiceCategory);
    }

}
