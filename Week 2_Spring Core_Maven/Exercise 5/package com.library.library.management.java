package com.library.library.management.example1;

import com.library.library.management.example1.service.BookService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LibraryManagementExample1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(LibraryManagementExample1Application.class, args);

		BookService BS=context.getBean(BookService.class);
				BS.management();
	}


}
