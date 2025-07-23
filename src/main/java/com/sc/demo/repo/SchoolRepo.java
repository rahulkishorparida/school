package com.sc.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sc.demo.model.School;

public interface SchoolRepo extends JpaRepository<School, Integer> {

}
