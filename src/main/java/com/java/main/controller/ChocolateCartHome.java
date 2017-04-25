package com.java.main.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.main.model.ChocolatePojo;
import com.java.main.service.AddNewChocolate;
import com.java.main.service.GetChocolate;
import com.java.main.service.LoadChocolatesData;

@RestController
@RequestMapping("/chocolateHome")
public class ChocolateCartHome implements ErrorController{
	private static Log LOG = LogFactory.getLog(ChocolateCartHome.class);
	@Autowired
	LoadChocolatesData loadChocolatesData;
	@Autowired
	AddNewChocolate addNewChocolate;
	@Autowired
	GetChocolate getChocolate;

	@RequestMapping(value = "/chocolist", method = RequestMethod.GET)
	public  List<ChocolatePojo> getChocolates() {
		List<ChocolatePojo> chocoList = loadChocolatesData.loadChocolatedata();
		LOG.debug("Successfully retrived chocolate list");
		return chocoList;
	}

	@RequestMapping(value = "/chocolist", method = RequestMethod.POST)
	public void addChocolate(ChocolatePojo c) {
		// add a new chocolate, give an appropriate message back on both success
		// and failure scenarios.
		addNewChocolate.addNewChocolate(c);
	}

	@RequestMapping(value="/getChocolate/{id}", method=RequestMethod.GET)
	public ChocolatePojo getChocolate(@PathVariable("id") String id) {
		//ChocolatePojo chocolate = getChocolate.getChocolateByRecordId(id);
		//LOG.debug("Successfully retrived chocolate with record id: " + chocolate.getRecordid());
		return new ChocolatePojo();
	}

    @RequestMapping(value = "/error")
    public String error() {
        return "Error handling";
    }
    
    @Override
    public String getErrorPath() {
        return "/error";
    }


}
