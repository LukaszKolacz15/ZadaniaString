package pl.akademiakodu.zad6;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-07.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz imię: ");
        String name = scanner.nextLine();
        System.out.print("Wpisz nawisko: ");
        String surname = scanner.nextLine();

        System.out.println("Twoje imie i nazwisko to: " + name + " " + surname);
    }
}