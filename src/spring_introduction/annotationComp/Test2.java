package spring_introduction.annotationComp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person2 person2 = context.getBean("person2Bean", Person2.class);
        person2.say();
    }

}
