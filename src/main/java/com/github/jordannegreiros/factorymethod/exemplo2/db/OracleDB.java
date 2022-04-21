package com.github.jordannegreiros.factorymethod.exemplo2.db;

public class OracleDB implements DB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Update query " + sql + " in Oracle database");
	}
}
