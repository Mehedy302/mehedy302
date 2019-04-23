package controller;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import javax.validation.Valid;
import java.util.List;
import view.MongoUtils;
import model.ApiModel;
import org.bson.Document;
 
@RestController
 
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	 MongoUtils repository;
	 
	 
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	  public int insertNid(@RequestBody ApiModel data) {
		repository.insertModel(data);
		return 100;
	  }
	
	@RequestMapping(value="/get",method = RequestMethod.GET)
	public  Document getAllUsers() {
		
	return	 repository.getData();
		
		
		 
		 
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.DELETE)
	  public int delete(@RequestBody ApiModel data) {
		repository.deleteEntiry(data);
		return -100;
	  }
	
	
	
	
	
}
	
	 




