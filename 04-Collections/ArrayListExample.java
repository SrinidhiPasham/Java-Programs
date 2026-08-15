import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mary");
        names.add("David");

        System.out.println(names);

        names.remove("Mary");

        System.out.println(names);
    }
}
