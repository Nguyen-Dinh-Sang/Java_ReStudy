package com.sangnd.java8.defaultmethod;

import com.sangnd.java8.defaultmethod.impl.MongoDB;
import com.sangnd.java8.defaultmethod.impl.MySQL;
import com.sangnd.java8.defaultmethod.impl.Oracle;
import com.sangnd.java8.defaultmethod.impl.Parallel;
import com.sangnd.java8.defaultmethod.impl.SQLServer;

public class TestDefaultMethod {
	public static void main(String[] args) {
		SQLServer sqlServer = new SQLServer();
		sqlServer.log("SQLServer");
		
		MySQL mySQL = new MySQL();
		mySQL.log("MySQL");
		
		Oracle oracle = new Oracle();
		oracle.log("Oracle");
		
		MongoDB mongoDB = new MongoDB();
		mongoDB.log("MongoDB");
		
		Parallel parallel = new Parallel();
		parallel.log("Parallel");
		
		DBManager dbManager = new Parallel();
		dbManager.read();
		dbManager.write();
		dbManager.log("DB Manager");
		
		NewManager newManager = new Parallel();
		newManager.read();
		newManager.write();
		newManager.log("New Manager");
	}
}
