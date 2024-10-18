import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {

    public static void main(String[] args) {

        List<Integer> listN = new ArrayList<>();

        listN.add(1);
        listN.add(2);
        listN.add(3);
        listN.add(4);
        listN.add(5);

        List<Integer>[] numeros = new List[]{listN};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("números " + numeros[i]);
        }

    }

}
