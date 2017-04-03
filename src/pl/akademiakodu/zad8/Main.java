package pl.akademiakodu.zad8;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-07.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz pierwsze słowo: ");
        String text1 = scanner.nextLine();
        System.out.print("Wpisz drugie słowo: ");
        String text2 = scanner.nextLine();

//        if(text1.equals(text2)){
//            System.out.println("Słowa sa takie same");
//        }
//        else{
//            System.out.println("Słowa nie są takie same");
//        }
        System.out.println(text1.equals(text2));
    }
}