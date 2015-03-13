package com.javacodegeeks.snippets.enterprise;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javacodegeeks.snippets.enterprise.model.Employee;
import com.javacodegeeks.snippets.enterprise.service.EmployeeService;

public class App {

	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*		Employee em = new Employee();
		em.setId("12");
		em.setName("Ivan");
		em.setUsername("ivan");
		em.setPassword("ivan2");
		*/
		EmployeeService emService = (EmployeeService) context.getBean("employeeService");
	//	emService.persistEmployee(em);
		Employee consulta = new Employee();
//		Employee consulta2 = new Employee();
		
		consulta = emService.findEmployeeById("2");
//		consulta2 = emService.findEmployeeByUsername("ivan");
		
		System.out.println (consulta.getName());
//		System.out.println (consulta2.getName());
		context.close();
	}

}
