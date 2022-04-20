package com.abhi.Assignment5.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BigData {

//    HiDSpark
    @Id
    private String clusterName;

    private String region;
    private String clusterType;
    private String softwareComponent;//Hive,Anaconda,Pesto,Spark,Jupyter Notebook,Flink,Zookeeper,Solr,Ranger,Hbase
//    Master Node Details
    private String machineFamily;//General Purpose, Compute Optimized, Memory Optimized
    private int cpus;//2,4,8,16,32
    private int memory;
    private int diskSize;//10,50,100
    private String diskType;//Standard and SSD

//    Worker Node Details
    private String wnMachineFamily;//General Purpose, Compute Optimized, Memory Optimized
    private int wnCpus;//2,4,8,16,32
    private int wnMemory;
    private int wnDiskSize;//10,50,100
    private String wnDiskType;//Standard and SSD

    private String encryption;//HiD managed or Customer managed


}
