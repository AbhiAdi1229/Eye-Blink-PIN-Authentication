package com.abhi.Assignment5.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class CloudServiceCategory {

    @Id
    private int id;
    private String categoryName;

//    @OneToMany(mappedBy = "cloudServiceCategory")
//    @JsonManagedReference()
//    private List<Services> services;

//    Compute Services - Virtual Machines (HiDMachine) / VPC (HiDVPC)
//    Storage Services - Object Storage (HiDObject)
//    Big Data - Big Data (HiDSpark)
//    Security and Identity Management - hard code - Identity & Access Management (HidIAM)
//    Operations Tools
//    Networking

}
