import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StructuriDeDate {
    public static void main(String[] args) {

        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.set(0, "First-updated");


        HashMap<Integer,String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1,"First");
        dictionarulNostru.put(2,"Second");
        dictionarulNostru.put(3,"Third");
        System.out.println(dictionarulNostru.keySet());

        // Tema 13
        HashMap<String,Boolean> cineTreceExamenul = new HashMap<>();
        cineTreceExamenul.put("Elev 1", false);
        cineTreceExamenul.put("Elev 2", true);
        cineTreceExamenul.put("Elev 3", true);
        cineTreceExamenul.put("Elev 4", false);
        cineTreceExamenul.put("Elev 5", true);
    }

}
