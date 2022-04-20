package com.abhi.Assignment5.repostitory;


import com.abhi.Assignment5.entity.CloudServiceCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudServiceCategoryRepos extends JpaRepository<CloudServiceCategory, Integer> {

}
