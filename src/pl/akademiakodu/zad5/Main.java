package pl.akademiakodu.zad5;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-07.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz dowolne słowo z cyframi lub bez: ");
        String word = scanner.nextLine();

        if(word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println("Pierwsze litery słowa są takie same :)");
        }
        else{
            System.out.println("Pierwsze litery słowa nie są takie same :(");
        }
    }
}