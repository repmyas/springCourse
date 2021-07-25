package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person2 person2 = context.getBean("myPerson2", Person2.class);
        person2.say();


        // закрываем контекст
        context.close();
    }

}
