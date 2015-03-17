package com.javacodegeeks.snippets.enterprise;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import com.javacodegeeks.snippets.enterprise.model.Employee;
import com.javacodegeeks.snippets.enterprise.service.EmployeeService;
import com.javacodegeeks.snippets.enterprise.model.Comment;
import com.javacodegeeks.snippets.enterprise.service.CommentService;
*/
@SpringBootApplication
public class App{

	public static void main(String[] args) {
		System.out.println("load context");
		SpringApplication.run(App.class, args);
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Employee em = new Employee();
		em.setId("10");
		em.setName("Laura");
		em.setUsername("laura");
		em.setPassword("l123");
		*/
		
	/*	Comment com = new Comment();
		com.setId("5");
		com.setCom("este es un comentario");
		com.setState(1);
	*/	
	//	CommentService comService = (CommentService) context.getBean("commentService");
	//	EmployeeService emService = (EmployeeService) context.getBean("employeeService");
		//emService.persistEmployee(em);
	//	Comment consulta3 = new Comment();
	//	comService.persistComment(com);
	//	Employee consulta = new Employee();
//		Employee consulta2 = new Employee();
		
	//	consulta3 = comService.findCommentById("5");
		//consulta = emService.findEmployeeById("10");
//		consulta2 = emService.findEmployeeByUsername("ivan");
		
		//System.out.println (consulta.getName());
	//	System.out.println(consulta3.getCom());
//		System.out.println (consulta2.getName());
	//	context.close();
	}

}
