package JocDelPenjat;

import java.util.ArrayList;
import java.util.Random;

public class joc {
    static String paraulaSecreta;

    static int posParaulaElegida;
    static Random random = new Random();
    static ArrayList<String> paraulesPerAdivinar = new ArrayList<>();

    public static void main(String[] args) {
        elegirParaulaAleatoria();
    }
    public static void elegirParaulaAleatoria() {

        paraulesPerAdivinar.add("Wisdom");
        paraulesPerAdivinar.add("Carlos");
        paraulesPerAdivinar.add("Patinete");
        paraulesPerAdivinar.add("Paella");
        int posRandom = random.nextInt(paraulesPerAdivinar.size());

    }

    public static void partida() {
        posParaulaElegida = random.nextInt(paraulesPerAdivinar.size());
        String paraula = paraulesPerAdivinar.get(posParaulaElegida);
        System.out.println("Benvingut al joc del penjat.");
        System.out.println("------------------------");
        System.out.println("Adivina la paraula:  " + paraulaSecreta);
        paraula = paraulaSecreta;

        char[] paraulaArray = paraulaSecreta.toCharArray();

        System.out.println(paraulaSecreta.toCharArray());



        }
    }

