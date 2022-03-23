package Animal;

/**
 * Author GrayCode
 */
public class Student implements Eat{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "eat");
    }
}
