package pl.akademiakodu.zad3;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-07.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz dowolne słowo:");
        String word = scanner.nextLine();

        if (word.endsWith("M") || word.endsWith("m")){
            System.out.println("Tak");
        }
        else{
            System.out.println("Nie");
        }
    }
}
