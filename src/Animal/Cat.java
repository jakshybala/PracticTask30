package Animal;

/**
 * Author GrayCode
 */
public class Cat extends AnimalParent implements Eat{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
