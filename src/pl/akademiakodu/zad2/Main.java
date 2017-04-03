package pl.akademiakodu.zad2;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-07.
 */
public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz dowolne słowo:");
        String word = scanner.nextLine();

        System.out.print("Wpisz dowolną liczbę:");
        int number = scanner.nextInt();

        System.out.println("Wynik: " + word.substring(word.length()- number));
    }
}