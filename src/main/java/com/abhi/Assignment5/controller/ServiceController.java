package com.abhi.Assignment5.controller;

import com.abhi.Assignment5.entity.CloudServiceCategory;
import com.abhi.Assignment5.entity.Services;
import com.abhi.Assignment5.repostitory.ServicesRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class ServiceController {

    @Autowired
    private ServicesRepos servicesRepos;

    //Check
    @GetMapping("/services")
    public String check(){
        return "Abhinav Aditya";
    }

    @GetMapping("/getAllServices")
    public List<Services> getAllServices(){
        return servicesRepos.findAll();
//    public Map<Integer, CloudServiceCategory> getCategories() {
//        List<CloudServiceCategory> list= cloudServiceCategoryRepos.findAll();
//        Map<Integer, CloudServiceCategory> map = new HashMap<Integer, CloudServiceCategory>();
//        for (int i=0;i<list.size();i++){
//            map.put(i,list.get(i));
//        };
//        return map;
    }

    @GetMapping("/getByName/{serviceId}")
    public Optional<Services> getByName(@PathVariable("serviceId") String serviceId){
        return servicesRepos.findById(serviceId);
    }

    //CREATE
    @PostMapping("/addServices")
    public Services addServices(@RequestBody Services services) {
        return servicesRepos.save(services);
    }
    //UPDATE
    @PutMapping("/updateService")
    public Services updateService(@RequestBody Services services) {
        return servicesRepos.save(services);
    }
    //DELETE
    @DeleteMapping("/deleteService/{serviceId}")
    public String deleteService(@PathVariable("serviceId") String serviceId){
        servicesRepos.deleteById(serviceId);
        return "Deleted";
    }
}
