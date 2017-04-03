package pl.akademiakodu.zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz dowolne słowo:");

        String word = scanner.nextLine();
        System.out.println(word.length());
    }
}
