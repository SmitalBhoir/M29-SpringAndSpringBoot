package org.tnsif.springioc;
//driver class
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CardExecutor {

	public static void main(String[] args) {
		
		/*SBICard s=new SBICard();
		HDFCCard h =new HDFCCard();
		s.deposit();
		s.withdraw();
		h.deposit();
		h.withdraw();
	}*/
	
	BeanFactory b=new ClassPathXmlApplicationContext("beans.xml");
	/*SBICard s=(SBICard)b.getBean("SBI");
	s.deposit();
	s.withdraw();
	HDFCCard s1=(HDFCCard)b.getBean("HDFC");
	s1.deposit();
	s1.withdraw();*/
	
	DebitCard s1 =(DebitCard) b.getBean("HDFC");
	s1.deposit();
	s1.withdraw();
	
	
	
	}
	
	
    
}
	
