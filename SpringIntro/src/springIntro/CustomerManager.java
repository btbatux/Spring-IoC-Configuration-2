package springIntro;

public class CustomerManager implements ICustomerService {
	
 private ICustomerDal customerDal; //Dependecy Injection
 

 
	public CustomerManager(ICustomerDal customerDal) {
	this.customerDal = customerDal;
}
 
 

// 	public void setCustomerDal(ICustomerDal customerDal) { //Setter Injection
//		this.customerDal = customerDal;
//	}
 
 
	@Override
	public void add(){
		//iş kuralları
		customerDal.add();
		
	}	
}
