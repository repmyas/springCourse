package spring_introduction.annotationComp;

public class Person3 {
    private Pet pet;

    public Person3(Pet pet) {
        this.pet = pet;
    }

    public void sayWithPet() {
        this.pet.say();
        System.out.println("Test Person3");
    }
}
