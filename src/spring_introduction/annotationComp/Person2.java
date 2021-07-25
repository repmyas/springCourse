package spring_introduction.annotationComp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person2Bean")
public class Person2 {
    private Pet pet;
    private String name;

    @Autowired
    public Person2(@Qualifier("dogBean") Pet pet) {
        this.pet = pet;

    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void say(){
        this.pet.say();
        System.out.println("Person2 say");
        System.out.println(name + ' ' + age);
    }
}
