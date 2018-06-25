package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Trikampio skaiciuokle.
        Scanner klavetura = new Scanner(System.in);

        //Pirma kraštinė.
        double a;
        System.out.println("Įveskite pirmą trikampio kraštinę: ");
        a = klavetura.nextDouble();

        //Antra kraštinė.
        double b;
        System.out.println("Įveskite antrą trikampio kraštinę: ");
        b = klavetura.nextDouble();

        //Trečia kraštinė.
        double c;
        System.out.println("Įveskite trečią trikampio kraštinę: ");
        c = klavetura.nextDouble();

        //Lygiakraštis.
        if (a==b && b==c){
            System.out.println("Trikampis yra lygiakraštis ir jo plotas yra "+a*b*c);
        }
        //Lygiašonis.
        else if (a==b || b==c || c==a) {
            System.out.println("Trikampis yra lygiašonis ir jo plotas yra "+a*b*c);
        }
        //Įvairiakraštis.
        else if (a!=b && b!=c && c!=a) {
            System.out.println("Trikampis yra įvairiakraštis ir jo plotas yra "+a*b*c);
        }
    }
}
