import java.util.ArrayList;
import java.util.List;

/*
What is type-eraser, does generic works in runtime
 */
public class GenericRuntimeCheck {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addNames(names, "Utsav");
        addNames(names, "Bruce");

        addNamesIncorrect(names, 100);
        String s = names.get(2);

    }

    private static void addNames(List<String> names, String name) {
        names.add(name);
    }


    private static void addNamesIncorrect(List list, Integer num) {
        list.add(num);
    }
}
