//Для введенной с клавиатуры строки необходимо провести отсев пробелов.
// Результат в виде строки без пробелов вывести на экран.

package Task12;
import java.util.Scanner;
public class Task12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = in.nextLine();
        String b=x.replaceAll(" ","");

        System.out.println("Строка без пробелов: " + b);
    }}
