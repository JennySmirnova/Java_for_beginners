//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
// где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

package Task10;

import java.util.Scanner;
public class Task10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте количество строк: ");
        int x = in.nextInt();
        System.out.print("Задайте количество столбцов: ");
        int y = in.nextInt();
        int mass[][] = new int[x][y];
        System.out.print("Введите элементы массива: ");
        for (int t = 0; t < 1; t++) {
            for (int i = 0; i < y; i++) {
                mass[t][i] = in.nextInt();
                System.out.println("Элемент["+0+"]["+i+"]:" + 3*mass[0][i] + " ");
            }
        }
    }}
