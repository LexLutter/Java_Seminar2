import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        HashMap<String, String> parametrs1 = new HashMap<String, String>();
        parametrs1.put("name", null);
        parametrs1.put("country", "Ukraine");
        parametrs1.put("city", "Kiev");
        parametrs1.put("age", "17");

        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : parametrs1.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        System.out.println(s.toString());
    }
}
