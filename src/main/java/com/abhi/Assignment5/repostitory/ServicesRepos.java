package com.abhi.Assignment5.repostitory;

import com.abhi.Assignment5.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepos extends JpaRepository<Services, String> {

}
