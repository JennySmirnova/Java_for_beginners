package Task6;
import java.util.Scanner;
public class Task6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = in.nextInt();
        System.out.print("Введите число y: ");
        int y = in.nextInt();
        System.out.print("Введите число z: ");
        int z = in.nextInt();
        double a = (x+y+z)/3.0f;
        int n = (int)a/2;

        System.out.printf("Среднее арифметическое число a: %.2f \n",  a);
        System.out.println("Деление a на 2 без остатка = " + n);

        if (n>3)
        {System.out.println("Программа выполнена корректно");}
    }
}
