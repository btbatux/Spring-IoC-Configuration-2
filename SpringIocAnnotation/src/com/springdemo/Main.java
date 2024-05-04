package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		 
		/*
		 * (IoC): Bu kavram, bir bileşenin kendi kontrolü üzerindeki yetkisini bir dış
		 * kaynağa devretmesini ifade eder. (Dependency Injection) Bir bileşen kendi
		 * bağımlılıklarını oluşturmaz veya yönetmez, bunun yerine dışarıdan enjekte
		 * edilir.
		 */

		// IocConfig sınıfını temel alarak bir AnnotationConfigApplicationContext oluşturuyoruz
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class);
		 	
		
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add(); // oracle add fonk çağır.

	}
}
