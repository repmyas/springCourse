package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        // вот тут уже создается объект синглтон и мы увидим саут из конструктора дог
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog1 =  context.getBean("myPet", Dog.class);
        Dog dog2 =  context.getBean("myPet", Dog.class);
        dog1.setName("Bobik");
        dog2.setName("Lolik");

        System.out.println(dog1.getName());
        System.out.println(dog2.getName());
        // вот тут уже конекст нормальный для типа дог а именно его скоп это прототайп
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog3 =  context2.getBean("myPet", Dog.class);
        Dog dog4 =  context2.getBean("myPet", Dog.class);
        dog3.setName("Bobik");
        dog4.setName("Lolik");

        System.out.println(dog3.getName());
        System.out.println(dog4.getName());
        // закрываем контекст
        context.close();
        context2.close();


    }

}
