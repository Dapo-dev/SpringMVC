package exer01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exer01.anno.controller.IController;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("exer01\\anno\\Beans.xml");
		
		IController c = ctx.getBean(IController.class);
		c.doWork();
		((ConfigurableApplicationContext)ctx).close();
	}
}
