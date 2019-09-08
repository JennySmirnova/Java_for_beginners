//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.

package Task11;

import java.util.Scanner;
public class Task11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = in.nextLine();

        System.out.println("Вы ввели: " + x);
}}
