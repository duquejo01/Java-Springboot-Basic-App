package com.platzi.sprintboot.basics;

import com.platzi.sprintboot.basics.bean.MyBean;
import com.platzi.sprintboot.basics.bean.MyBeanWithDependency;
import com.platzi.sprintboot.basics.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicsApplication implements CommandLineRunner {

	private ComponentDependency componentDependency; // Basic component
	private MyBean myBean; // Custom Bean
	private MyBeanWithDependency myBeanWithDependency; // Bean with inner dependency

	@Autowired
	public BasicsApplication(
			@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
			MyBean myBean,
			MyBeanWithDependency myBeanWithDependency
		) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Execute our application.
		componentDependency.greetings();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
