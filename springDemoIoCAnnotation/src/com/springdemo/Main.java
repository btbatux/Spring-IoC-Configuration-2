package com.springdemo;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 
			 
		/*	(IoC):
			Bu kavram, bir bileşenin kendi kontrolü üzerindeki yetkisini bir dış kaynağa devretmesini ifade eder. 
			(Dependency Injection)
			Bir bileşen kendi bağımlılıklarını oluşturmaz veya yönetmez, bunun yerine dışarıdan enjekte edilir.
		 */
		
		try (ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
		
			ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
			customerDal.add(); //oracle add fonk çağır.
			
			
		} catch (BeansException e) {
			e.printStackTrace();
		}	
	}
}
