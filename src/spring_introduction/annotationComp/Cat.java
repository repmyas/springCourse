package spring_introduction;


import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements Pet {

    private String name;

    public Cat() {
        System.out.println("Cat is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Cat is say ");
    }
}
