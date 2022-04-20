package com.abhi.Assignment5.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StorageServices {

//HiDObject
    @Id
    private String objectStorage;//objectStorage="HiDObject";

    private String bucketName;
    private String region;
    private String storageType;//public or private;
    private String encryption;//Cloud or Client managed
    private String storageClass;//Optimized, Standard, Archival

}
