package model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class ApiModel {
	ObjectId _id;
	String name;
	String country;
	String rate;
 
	
	public ApiModel(ObjectId _id, String name, String country, String rate) {
	    this._id = _id;
	    this.name = name;
	    this.country = country;
	    this.rate = rate;
	  }
	  
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	 
	 
	 
	 
	 
}
	
	 