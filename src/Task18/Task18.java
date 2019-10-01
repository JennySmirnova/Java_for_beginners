//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
// а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
// Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

package Task18;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Task18 {
    public static void main (String args[]) {
        String file;
        int count=0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\Test\\src\\Test17.txt"))) {
            while ((file = br.readLine()) != null) {
                System.out.println(file);
                count++;
            }

            String str;
            BufferedReader br1 = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Введите текстовые данные: ");
            try (FileWriter fw = new FileWriter("C:\\Users\\user\\IdeaProjects\\Test\\src\\Test17.txt")) {
                for (int i = 0; i <count; i++) {
                    System.out.print(i + ": ");
                    str = br1.readLine();
                    str = str + "\r\n";
                    fw.write(str); }
                }
            }

            catch (IOException exc) {
            System.out.println("Ошибка чтения файла: " + exc);
        }
      }
}