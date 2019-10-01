//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен задавать размер массива и наполнять его числами.
// Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
package Itog2;

import java.util.Scanner;

public class Itog2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int x = in.nextInt();
        int mass[];
        mass = new int[x];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < x; i++)
            mass[i] = in.nextInt();
        insertIntoSort(mass);
    }

    public static void insertIntoSort(int[] mass) {
        int temp, j;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                temp = mass[i + 1];
                mass[i + 1] = mass[i];
                j = i;
                while (j > 0 && temp < mass[j - 1]) {
                    mass[j] = mass[j - 1];
                    j--;
                }
                mass[j] = temp;
            }
        }
        for (int i = 0; i < mass.length; i++)
            System.out.println("Элемент[" + i + "]: " + mass[i]);
    }
}