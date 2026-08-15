import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> details = new HashMap<>();

        details.put("Name", "Srinidhi");
        details.put("Role", "QA Engineer");
        details.put("Tool", "Selenium");

        System.out.println(details);

        System.out.println(details.get("Role"));
    }
}
