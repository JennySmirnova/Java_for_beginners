package Task7;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Task7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int X = 6;
        int Y = 7;
        int Z = 8;

        if (number == X || number == Y || number == Z) System.out.print("Данное значение имеется в константах \n");
        else System.out.print("Такой константы нет! \n");
    }
}
