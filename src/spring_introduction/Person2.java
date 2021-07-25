package spring_introduction;

public class Person2 {
    private Pet pet;


    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void say(){
        this.pet.say();
        System.out.println("Person2 say");
    }
}
