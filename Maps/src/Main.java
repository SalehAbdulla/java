import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap <String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsValue(54321));
        empIds.put("John", 1234);
        System.out.println(empIds);

    }
}