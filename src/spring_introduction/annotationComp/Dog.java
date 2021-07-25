package spring_introduction.annotationComp;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {

    private String name;

    public Dog() {
        System.out.println("Dog is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Dog is say ");
    }
}
