import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public static void main(String[] args) {

        String fruits1 = "Apple";
        String fruits2 = "Banana";
        String fruits3 = "Cherry";

        List<String> listFruits = new ArrayList<>();

        //Agregar elementos
        listFruits.add(fruits1);
        listFruits.add(fruits2);
        listFruits.add(fruits3);

        //Cantidad de  elementos
        System.out.println(listFruits.size());

        //Remover//
        listFruits.remove(1);
        System.out.println(listFruits);

        //Reemplazar
        listFruits.set(1,"Orange");
        System.out.println(listFruits);

    }
}
