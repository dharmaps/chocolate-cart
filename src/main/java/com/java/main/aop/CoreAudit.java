package com.java.main.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CoreAudit {
	Log log = LogFactory.getLog(CoreAudit.class);
	
	@Pointcut("execution(* com.java.main.controller.ChocolateCartHome.getChocolates())")
	public void getChocolates(){}
	
	@Before("getChocolates()")
	public void logUser(){
		log.info("User requested for chocolates List");
	}
	
	@After("getChocolates()")
	public void logSuccessfulRetrival(){
		log.info("Chocolates List loaded succesfully");
	}
	
	@AfterThrowing("getChocolates()")
	public void logFailure(){
		log.info("Chocolate list failed to load");
	}
	
	

}
