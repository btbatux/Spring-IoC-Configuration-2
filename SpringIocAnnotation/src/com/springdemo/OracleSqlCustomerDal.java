package com.springdemo;



public class OracleSqlCustomerDal implements ICustomerDal {

	String connectionString = "Test Oracle";  //String enjeksiyon xml üzerinden classlardaki ortak string değişkenini tek bir yerden yönettik
	

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
