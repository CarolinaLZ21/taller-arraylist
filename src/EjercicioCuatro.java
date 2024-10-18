import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {

    public static void main(String[] args) {

        List<String> List1 = new ArrayList<>();
        List<String> List2 = new ArrayList<>();
        List<String> ListCommonElements = new ArrayList<>();

        List1.add("Apple");
        List1.add("Banana");
        List1.add("Cherry");
        List1.add("Date");

        List2.add("Banana");
        List2.add("Date");
        List2.add("Elderberry");
        List2.add("Fig");

        for (String com : List1) {
            if (List2.contains(com)) {
                ListCommonElements.add(com);
            }
        }

        System.out.println("Elementos Comunes: " + ListCommonElements);
    }
}
