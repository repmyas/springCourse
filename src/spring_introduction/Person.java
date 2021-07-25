package spring_introduction;

public class Person {
    public Pet pet;
    public  Person(Pet pet){
        this.pet = pet;
    }
    public void say(){
        this.pet.say();
        System.out.println("Person say");
    }


}
