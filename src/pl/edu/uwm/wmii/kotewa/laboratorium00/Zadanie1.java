package pl.edu.uwm.wmii.kotewa.laboratorium00;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Styczeń,Luty,marzec;
        System.out.println("Podaj dni w Styczniu: ");
        Styczeń = scanner.nextInt();
        System.out.println("Podaj dni w Lutym: ");
        Luty = scanner.nextInt();
        System.out.println("Podaj dni w marcu: ");
        marzec = scanner.nextInt();

        System.out.println("wynik sumy pierwszych 3 miesięcy: "+ (Styczeń + Luty + marzec) + " Dni");
	// write your code here
    }
}
