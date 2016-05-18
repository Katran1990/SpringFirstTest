package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Phrase obj = (Phrase) context.getBean("Phrase");
        obj.sayPhrase();
    }
}
