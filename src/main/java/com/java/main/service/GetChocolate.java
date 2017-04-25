package com.java.main.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.main.dao.LoadChocolatesDao;
import com.java.main.model.ChocolatePojo;

@Service
public class GetChocolate {
	Log LOG = LogFactory.getLog(GetChocolate.class);
	
	@Autowired
	private LoadChocolatesDao loadChocolatesDao;
	
	public ChocolatePojo getChocolateByRecordId(String recordid){
		ChocolatePojo chocolatePojo = loadChocolatesDao.getChocolateByRecordId(recordid);
		LOG.debug("Chocolate retrived successfully. ID: "+chocolatePojo.getRecordid() );
		return chocolatePojo;
	}

}
