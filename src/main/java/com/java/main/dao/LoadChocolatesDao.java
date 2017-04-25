package com.java.main.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.java.main.model.Chocolate;
import com.java.main.model.ChocolatePojo;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

@Repository
public class LoadChocolatesDao {
	@Autowired
	MongoTemplate mongo;
	
	public List<ChocolatePojo> loadChocolatedata() {
		List<ChocolatePojo> chocolates = null;
		DBCursor curs;
		int count = 0 ;
		try {
			chocolates = new ArrayList<ChocolatePojo>();
			DBCollection chocodata = mongo.getCollection("chocodata");
			curs = chocodata.find();
			while(curs.hasNext() && count<30){
				DBObject o = curs.next();
				ChocolatePojo c = mongo.getConverter().read(ChocolatePojo.class, o); 
				chocolates.add(c);
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chocolates;
	}

	
	
	public Boolean addChocolate(ChocolatePojo c){
		Boolean flag = false;
		try {
			DBCollection collection = mongo.getCollection("chocodata");
			JSONObject chocolateJson = new JSONObject(c);
			DBObject obj = (DBObject) chocolateJson;
			collection.insert(obj);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public ChocolatePojo getChocolateByRecordId(String recordid){
		Query query = new Query();
		query.addCriteria(Criteria.where("recordid").is(recordid));
		MongoOperations mongoOperation = (MongoOperations) mongo;
		ChocolatePojo chocolate = mongoOperation.findOne(query, ChocolatePojo.class);
		return chocolate;
	}

}
