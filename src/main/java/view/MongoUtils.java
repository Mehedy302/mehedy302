package view;

import model.ApiModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

import org.bson.types.ObjectId;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.bson.Document;
@Component
 
@Service
public class MongoUtils  {
	
	
	
	
	 
	 
	 
	MongoClient mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017)));

	@SuppressWarnings("deprecation")
	MongoDatabase db = mongoClient.getDatabase("Mofajjol" );
	 
	
	MongoCollection<Document> myCollection =db.getCollection("mofajjol");
	  
	
	 
	
//	 @Autowired
//	 public MongoUtils(MongoDbFactory factory){
//		 MongoDatabase db = factory.getDb();
//		 myCollection  = db.getCollection("NID");
//		  
//		 
//	 }
//	 
	  
	 
	 public void insertModel(ApiModel data)
	 {
		 Document object  =  new Document();
		  
		 object.put("name",data.getName());
		  
		 object.put("country",data.getCountry());
		 
		 object.put("rate",data.getRate());
		  
		 
		 myCollection.insertOne(object);
		 
		 
	 
		 
		 
	 }
	 
	 
	 
	 
	 public Document getData( )
	 {
		 
		 FindIterable findIterable = myCollection.find();
		    Iterator iterator = findIterable.iterator();
		 Object obj = new Object();
		 Document object  =  new Document();
		 String id = "1";
		 Integer p  =1;
		  
//		 BasicDBObject searchQuery = new BasicDBObject();
//			searchQuery.put("name", "Mofajjol");
		 
		 
		 while(iterator.hasNext()) {
			 object.put(id,iterator.next() );
			 
			 p = p+ 1;
			 id = p.toString();
				 
		 }
		 
		 return object;
	 }
	 
	 public void deleteEntiry( ApiModel data)
	 {
		 BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put("name",data.getName());

			myCollection.deleteOne((searchQuery));
		 
		 
	 }
	 
	 
	 
		
		
	
	
	}


