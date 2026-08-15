import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("John");
        names.add("Mary");
        names.add("John");

        System.out.println(names);
    }
}
