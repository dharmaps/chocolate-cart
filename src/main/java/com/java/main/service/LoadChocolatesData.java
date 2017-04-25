package com.java.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.main.dao.LoadChocolatesDao;
import com.java.main.model.ChocolatePojo;

@Service
public class LoadChocolatesData {
	@Autowired
	private LoadChocolatesDao loadChocolatesDao;

	public List<ChocolatePojo> loadChocolatedata() {
		List<ChocolatePojo> chocolatesList = loadChocolatesDao.loadChocolatedata();
		return chocolatesList;
	}
	

}
