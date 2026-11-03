package com.util;

public class OLDDbConnection {

	//java app ---> mysql / pg / oracle -> db connection open 

	private static OLDDbConnection db; 

	//private constructor 
	private OLDDbConnection() {
	} 
	
	
	
	
	static OLDDbConnection getConnection() {
		if(db == null) {
			db = new OLDDbConnection();
			return db;
		}
		return db; 
	}
	
	public static void main(String[] args) {

		
		//single object 
	}
}

//singleton design pattern 
//class ->1 object -> memory 
//
class A{
	void login() {
		OLDDbConnection db = OLDDbConnection.getConnection();
		db.getConnection();
	}
}
