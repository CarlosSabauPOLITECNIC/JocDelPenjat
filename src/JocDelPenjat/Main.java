package JocDelPenjat;

import java.util.*;
import java.util.Random;

public class Main {


    // ----- Todos los valores ----- //
   static int posParaulaElegida;
   Scanner sc = new Scanner(System.in);
   static String paraulaRandom;
   static Random random = new Random();
   static ArrayList<String> paraulesPerAdivinar = new ArrayList<>();

    // ----------------------------- //
    public static void main(String[] args) {
        partida();



    }


    public static void elegirParaulaAleatoria() {

        paraulesPerAdivinar.add("Wisdom");
        paraulesPerAdivinar.add("Carlos");
        paraulesPerAdivinar.add("Patinete");
        paraulesPerAdivinar.add("Paella");
        posParaulaElegida = random.nextInt(paraulesPerAdivinar.size());
        paraulaRandom = paraulesPerAdivinar.get(posParaulaElegida);
    }
    public static String generadorParaulaEncriptada(){

        for (int i = 0; i < paraulaRandom.length(); i++) {
            System.out.print("_ ");

        }
        return paraulaRandom;
    }
    public static void partida() {
        System.out.println("Benvingut al joc del penjat.");
        System.out.println("------------------------");
        System.out.print("Adivina la paraula:  "); elegirParaulaAleatoria(); generadorParaulaEncriptada();
        System.out.print("Lletra: ");

        posParaulaElegida = random.nextInt(paraulesPerAdivinar.size());
        paraulaRandom = paraulesPerAdivinar.get(posParaulaElegida);

    }
}
/*char lletra = sc.next().charAt(0);
        for (int i = 0; i < paraulaRandom.length() ; i++) {

        }*/