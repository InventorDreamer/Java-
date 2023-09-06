package ru.mirea.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания:\n1.Цикл for\n2.Цикл while");
        choose = scanner.nextInt();
        switch(choose) {
            case 1: {
                System.out.println("Введите количество элементов массива: ");
                if (!(scanner.hasNextInt())) {
                    System.out.println("Не число");
                    return;
                }
                int[] arr = new int[scanner.nextInt()];
                float total = 0;
                float sr;
                System.out.println("Введите элементы через пробел.");
                for (int i = 0; i < arr.length; i++) {
                    if (!(scanner.hasNextInt())) {
                        System.out.println("Не число");
                        return;
                    }
                    arr[i] = scanner.nextInt();
                    total += arr[i];
                }
                sr = total / arr.length;
                System.out.println("Сумма элементов:" + total + "\nСреднее арифметическое:" + sr);
                break;
            }
            case 2: {

            }
        }
    }
}

