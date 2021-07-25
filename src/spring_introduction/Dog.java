package spring_introduction;

public class Dog implements Pet {

    static int count = 0;
    Dog () {
        count++;
        System.out.printf("Dog № " + count + " is created\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public void say(){
        System.out.println("Dog is say ");
    }
}
