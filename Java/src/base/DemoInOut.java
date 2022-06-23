package base;

import java.util.Scanner;

public class DemoInOut {

    public static void main(String[] args) {

        // Ecrire dans la console

        System.out.println("un truc");

        // Lire dans la console

        Scanner sc = new Scanner(System.in);
        int entier = sc.nextInt();

        System.out.println(entier);

    }

}
