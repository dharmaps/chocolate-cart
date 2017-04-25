package com.java.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.main.dao.LoadChocolatesDao;
import com.java.main.model.ChocolatePojo;

@Service
public class AddNewChocolate {
	
	@Autowired
	private LoadChocolatesDao loadChocolatesDao;
	
	public Boolean addNewChocolate(ChocolatePojo c){
		Boolean flag = loadChocolatesDao.addChocolate(c);
		return flag;
	}

}
