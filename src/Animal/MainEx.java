package Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author GrayCode
 */
public class MainEx {
    public static void main(String[] args) {

        int x=10;
        int y=0;
        try {
            System.out.println(x/y);
                throw new ArithmeticException();
        }catch (ArithmeticException e) {
            System.err.println("Int cant devide by Zero");
        }

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        list.add("1");
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("____");
        list.stream().sorted().forEach(lst -> System.out.println(lst));
        System.out.println("___________");
        List<String> sortedlist = list.stream().sorted().collect(Collectors.toList());
        sortedlist.forEach(System.out::println);
        sortedlist.sort((o1, o2) -> o1.compareTo(o2));



    }
}
