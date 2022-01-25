package application;

import entities.Calculo2;

import java.util.Locale;
import java.util.Scanner;

public class Retangle2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculo2 calculo2 = new Calculo2();
        System.out.println("Enter rectagle width and height: ");
        System.out.print("Base: ");
        calculo2.base=sc.nextDouble();
        System.out.print("Altura: ");
        calculo2.altura= sc.nextDouble();

        System.out.println("Area: " + calculo2.area());
        System.out.println("Perimetro: "+ calculo2.perimetro());
        System.out.println("Diagonal: "+ calculo2.diagonal());

        sc.close();
    }
}
