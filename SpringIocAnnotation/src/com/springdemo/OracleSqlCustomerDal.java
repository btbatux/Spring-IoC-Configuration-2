package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class OracleSqlCustomerDal implements ICustomerDal {

	@Value("${database.connectionString}")
	String connectionString;  //String enjeksiyon xml üzerinden classlardaki ortak string değişkenini tek bir yerden yönettik
	

//	public String getConnectionString() {
//		return connectionString;
//	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}



	
	@Override
	public void add() {
		System.out.println(connectionString);
		System.out.println("Oracle  DB Eklendi..");
		
	}

}
