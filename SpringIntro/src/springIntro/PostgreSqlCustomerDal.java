package springIntro;

public class PostgreSqlCustomerDal implements ICustomerDal {
	
	
	String connectionString;
	

	
	public String getConnectionString() {
		return connectionString;
	}

	
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	
	
	@Override
	public void add() {
		System.out.println(connectionString);
		System.out.println("Postgre Sql DB Eklendi..");
		
	}

}
