package com.sc.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sc.demo.model.School;
import com.sc.demo.repo.SchoolRepo;
import com.sc.demo.service.SchoolSercice;

public class SchoolServiceImpl implements SchoolSercice {
	@Autowired
	private SchoolRepo repo;
	@Autowired
	private SchoolSercice sercice;

	@Override
	public boolean saveschool(School school) {
		return sercice.saveschool(school);
		
	}

}
