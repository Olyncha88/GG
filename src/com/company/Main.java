package com.company;
import java.util.Scanner; // импорт сканнера

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World"); //
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите <user>"); //
        String User = sc.nextLine();
        System.out.println("Hello, " + User);
        System.out.println("Переведём градусы Цельсия в градусы Фаренгейта...");
        System.out.println("Введите значание в градусах Цельсия");
        double cel = sc.nextDouble();
        double far = (cel * 1.8) + 32;
        System.out.println("В Фаренгейтах - это " + far);
    }
}

