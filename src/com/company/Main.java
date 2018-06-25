package com.company;

public class Main {

    public static void main(String[] args) {
        String[] vardas = {"Jonas", "Petras", "Jurgis"};
        String[] pavarde = {"Jonaitis", "Petraitis", "Jurgaitis"};

        double[] trimestras = {8,9,8,10};
        double vidurkis;
        double suma = 0;

        for (int i=0; i<trimestras.length; i++){

            suma = trimestras[i] + suma;
        }
        vidurkis = suma / trimestras.length;
        System.out.println(vardas +" "+ pavarde +" "+ vidurkis);

    }
}
