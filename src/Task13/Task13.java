//Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
// Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
package Task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = in.nextLine();
        int lengtha = a.length();
        System.out.print("Введите вторую строку: ");
        String b = in.nextLine();
        int lengthb = b.length();
        if (lengthb > lengtha) System.out.println("Строка c наибольшей длиной: " + b);
        else if (lengthb == lengtha) System.out.println("Длина строк равна");
        else System.out.println("Строка c наибольшей длиной: " + a);
    }
}
