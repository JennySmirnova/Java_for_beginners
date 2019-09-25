//Выгрузка данных из файла на экран.
//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

package Task16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main (String args[]) {
        String file;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\Test\\src\\test.txt"))) {
            while ((file = br.readLine()) != null) {
                System.out.println(file);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка чтения файла: " + exc);
        }
    }
}
