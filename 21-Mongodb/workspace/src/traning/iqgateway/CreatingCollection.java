package traning.iqgateway;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class CreatingCollection {
	public static void main(String[] args) {
		// creating a mongo client
		MongoClient mongo = new MongoClient((new MongoClientURI("mongodb://localhost:27017")));
		
		//creating credentials
		MongoCredential credentialRef = MongoCredential.createCredential("TMS1", "EmployeeDB", "TMS1".toCharArray());
		System.out.println("Connected to mongodb atlas");
		System.out.println("Credentials: "+credentialRef);
		
		// Accessing the database
		MongoDatabase database = mongo.getDatabase("EmployeeDB");
		
		//Creating a collection
		database.createCollection("Sample collection");
		System.out.println("Collection created successfuly");
	}
}
