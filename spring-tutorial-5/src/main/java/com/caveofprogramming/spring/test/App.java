package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		/*contenedor de beans. Así puedo traerme cualquier bean. 
		FileSystemXmlApplicationContext recibe como param el nombre del archivo de beans (o su ruta)*/
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/caveofprogramming/spring/test/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		/*Entonces en vez de hacer Person person = new Person();
		hago Person person = context.getBean("person");
	    */
		//getBean() recibe el id del bean, e instancia una clase persona. Casteo el tipo
		//de dato q devuelve
		Person person = (Person)context.getBean("person");
		person.speak();
		System.out.println(person);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
