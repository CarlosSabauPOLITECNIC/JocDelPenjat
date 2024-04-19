import java.util.ArrayList;
import java.util.Random;

public class joc {

    static int posParaulaElegida;
    static Random random = new Random();
    static ArrayList<String> paraulesPerAdivinar = new ArrayList<>();

    public static void main(String[] args) {
        elegirParaulaAleatoria();
    }
    public static void elegirParaulaAleatoria() {

        paraulesPerAdivinar.add("Wisdom");
        paraulesPerAdivinar.add("Carlos");
        paraulesPerAdivinar.add("Patiinete");
        paraulesPerAdivinar.add("Paella");
        System.out.println(paraulesPerAdivinar);
        int posRandom = random.nextInt(paraulesPerAdivinar.size());

    }

    public static void partida() {
        System.out.println(paraulesPerAdivinar.size());
        // System.out.println("Benvingut al joc del penjat");
        // System.out.println("---------------------------");
        // System.out.println("Paraula: " + paraulesPerAdivinar.get(posParaulaElegida));

    }

}

