package pl.akademiakodu.zad4;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-07.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz dowolne słowo z cyframi lub bez: ");
        String word = scanner.nextLine();

        if(Character.isDigit(word.charAt(0))){
            System.out.println("Pierwszym znakiem jest cyfra");
        }
        else{
            System.out.println("Pierwszym znakiem nie jest cyfra");
        }

    }
}