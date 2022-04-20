package com.abhi.Assignment5.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Services {

    @Id
    private String serviceId;
    private String serviceName;

//    private int catId;



//    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonBackReference()
//    @JoinColumn(name = "catId", referencedColumnName = "id")
//    private CloudServiceCategory cloudServiceCategory;

}
