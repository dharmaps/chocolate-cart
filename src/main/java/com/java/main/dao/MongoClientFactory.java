package com.java.main.dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.java.main.aop.CoreAudit;
import com.mongodb.MongoClient;

import ch.qos.logback.core.joran.spi.NoAutoStart;

@Configuration
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@ComponentScan
public class MongoClientFactory {
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {


	    // Mongo Client
	    MongoClient mongoClient = new MongoClient("localhost", 27017); 

	    // Mongo DB Factory
	    SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(
	            mongoClient, "chocolates");

	    return simpleMongoDbFactory;
	}

	/**
	 * Template ready to use to operate on the database
	 * 
	 * @return Mongo Template ready to use
	 */
	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
	    return new MongoTemplate(mongoDbFactory());
	}
	
	@Bean
	public CoreAudit coreAudit(){
		return new CoreAudit();
	}

}
