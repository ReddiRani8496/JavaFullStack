package MongoDBTest.training.mongoDB;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class CreatingCollection {
	public static void main(String[] args) {
		// creating a mongo client
		
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		
		 
		
		//creating credentials
		MongoCredential credentialRef = MongoCredential.createCredential("TMS1", "EmployeeDB", "TMS1".toCharArray());
		System.out.println("Connected to mongodb atlas");
		System.out.println("Credentials: "+credentialRef);
		
		// Accessing the database
		MongoDatabase database = mongoClient.getDatabase("EmployeeDB");
		
		//Creating a collection
//		database.createCollection("Sample collection");
		System.out.println("Collection created successfuly");
		
		MongoCollection<Document> collection = database.getCollection("Employee");
		System.out.println(collection.find().first().toJson());
		
		
//		Document document = new Document("title", "MongoDB")
//				.append("description", "Database")
//				.append("likes" , 100)
//				.append("url", "http://www.mongodb.com/")
//				.append("by", "MongoDB");
//		collection.insertOne(document);
//		System.out.println("Document Inserted Successfully ... ");	
		
		// update collection
		collection.updateOne(Filters.eq("title","MongoDB"), Updates.set("likes", 150));

		// Getting The Iterable Object
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
		Iterator it = iterDoc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
	}
}
