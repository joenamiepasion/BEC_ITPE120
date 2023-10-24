public class ConstructorsMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        System.out.println("My dog is a " + myDog.breed + " named " + myDog.name);
    }
}