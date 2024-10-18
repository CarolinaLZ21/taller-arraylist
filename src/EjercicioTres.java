import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {

    public static void main(String[] args) {

        List<Integer> Listnumbers = new ArrayList<>();
        List<Integer> ListevenNumbers = new ArrayList<>();

        // Llenando la lista con los números del 1 al 10

        Listnumbers.add(1);
        Listnumbers.add(2);
        Listnumbers.add(3);
        Listnumbers.add(4);
        Listnumbers.add(5);
        Listnumbers.add(6);
        Listnumbers.add(7);
        Listnumbers.add(8);
        Listnumbers.add(9);
        Listnumbers.add(10);


        // números pares
        for (int number : Listnumbers) {
            if (number % 2 == 0) {
                ListevenNumbers.add(number);
            }
        }

        // lista original
        System.out.println("Lista original: " + Listnumbers);

        // lista de números pares
        System.out.println("Números pares: " + ListevenNumbers);
    }
}