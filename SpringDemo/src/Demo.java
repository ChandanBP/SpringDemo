import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Person person=(Person)context.getBean("person");
		System.out.println("First name "+person.firstName);
		System.out.println("Last name "+person.lastName);
		System.out.println("Address "+person.address);
	}
}
