package traning.iqgateway;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class ConnectToDB {
	public static void main(String[] args) {
		// creating a mongo client
		MongoClient mongo = new MongoClient("localhost",27017);
		
		//creating credentials
		MongoCredential credentialRef = MongoCredential.createCredential("TMS1", "EmployeeDB", "TMS1".toCharArray());
		System.out.println("Connected to mongodb atlas");
		System.out.println("Credentials: "+credentialRef);
	}
}
