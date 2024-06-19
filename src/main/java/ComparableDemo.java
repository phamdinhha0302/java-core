import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog(1,"shiba"));
        dogs.add(new Dog(4,"bit"));
        dogs.add(new Dog(3,"milu"));
        dogs.add(new Dog(2,"cau vang"));
        Collections.sort(dogs);
        for (Dog dog : dogs){
            System.out.println(dog);
        }
    }
}
