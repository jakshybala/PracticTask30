package Animal;

import java.util.Arrays;

/**
 * Author GrayCode
 */
public class MainAnimal {
    public static void main(String[] args) {
        AnimalParent animalParent = new Cat("Tom",12);
        AnimalParent animalParent1 = new Dog("rEX",12);
//       AnimalParent animalParent2 = new Student();
        Cat eat = new Cat("Tom",12);
        Student eat1 = new Student("Altzn");
        AnimalParent[] animalArray = {animalParent, animalParent1};
        System.out.println(Arrays.toString(animalArray));
//        Eat[] sd = {eat, eat1};
    }
}
