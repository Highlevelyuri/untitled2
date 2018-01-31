package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	double number = 0D;
	double number2 = 0D;

        System.out.println( " Введите число-делимое: ");
        number = scanner.nextDouble();

        System.out.println(" Введите число-делитель:");
        number2 = scanner.nextDouble();
        System.out.println("Результат :" + number/ number2 );
         if( number2 == 0 )
             System.out.println(" Ошибка!");
    }
}
