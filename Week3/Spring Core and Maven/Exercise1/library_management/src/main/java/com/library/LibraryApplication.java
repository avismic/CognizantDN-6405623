package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = ctx.getBean("bookService", BookService.class);
        service.printBook("123");  
        

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
