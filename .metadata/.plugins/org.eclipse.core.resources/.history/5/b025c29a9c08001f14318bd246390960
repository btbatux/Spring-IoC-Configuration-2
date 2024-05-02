package springIntro;
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
			
			
			ICustomerService customerService = context.getBean("service",ICustomerService.class);
			customerService.add(); //oracle add fonk çağır.
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
