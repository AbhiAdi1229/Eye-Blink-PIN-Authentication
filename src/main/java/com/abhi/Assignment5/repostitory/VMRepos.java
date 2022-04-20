package com.abhi.Assignment5.repostitory;

import com.abhi.Assignment5.entity.ComputeServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VMRepos extends JpaRepository<ComputeServices, String> {

//     ComputeServices findByCatId(int catId);
}
