package spring_introduction.annotationComp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person2 person2 = context.getBean("person2Bean", Person2.class);
        person2.say();*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person3 person3 = context.getBean("person3Bean", Person3.class);
        person3.sayWithPet();
    }

}
