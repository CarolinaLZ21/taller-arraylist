import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    public static void main(String[] args) {

        List<Integer> listNumeE = new ArrayList<>();

        //Agregar elementos
        listNumeE.add(1);
        listNumeE.add(2);
        listNumeE.add(3);
        listNumeE.add(4);
        listNumeE.add(5);

        // Usa un bucle for para imprimir cada número
        for (int i = 0; i < listNumeE.size(); i++) {
            System.out.println("número " +listNumeE.get(i));
        }

        // Usa un bucle for-each para imprimir los mismos números.
        System.out.println("ahora  con for-each");
        for (int num : listNumeE) {
            System.out.println(num);
        }

        // Usa un bucle while para imprimir los números en orden inverso
        System.out.println("ahora orden inverso");
        int i = listNumeE.size() - 1;
        while (i >= 0) {
            System.out.println(listNumeE.get(i));
            i--;


        }
    }
}







