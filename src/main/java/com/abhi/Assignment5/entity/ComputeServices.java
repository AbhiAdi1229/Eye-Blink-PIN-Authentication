package com.abhi.Assignment5.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ComputeServices {


    @Id
    private int id;
    private String vm;
    private String name;
    private String region;
    private String machineFamily;
    private int cpus;
    private int memory;
    private int diskSize;
    private String diskOs;
    private String traffic;

//    private int catId;

}
