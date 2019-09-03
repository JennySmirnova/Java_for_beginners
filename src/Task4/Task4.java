package Task4;
import java.util.Scanner;
public class Task4 {
     public static void main(String args[]){
         Scanner in = new Scanner(System.in);
         System.out.print("Введите число в бинарном формате: ");
         String num = in.next();
         System.out.println("Число в десятичном формате: "+ Integer.parseInt(num,2));
     }
}

