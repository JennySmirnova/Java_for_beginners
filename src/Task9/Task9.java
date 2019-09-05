//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
// где каждый элемент массива умножается на 2. Размер массива задается пользователем.

package Task9;

import java.util.Scanner;
public class Task9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int x = in.nextInt();
        int mass[];
        mass=new int[x];
        System.out.print("Введите элементы массива: " );
        for(int i=0; i<x; i++)
            mass[i]=in.nextInt();
        for(int i=0; i<x; i++)
         System.out.println("Элемент["+ i +"]:" +  (2*mass[i]));
    }
}
